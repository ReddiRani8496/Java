public class CoVariantReturnType {
    public static void main(String[] args) {
        new Nick().hello();
        new Nick().hi();
    }
}
class Rock {
    Rock hello() {
        return this;
    }
    Object hi() {
        return this;
    }
}
class Nick extends Rock {
   /* @Override
    Nick hello() { // we can override method using subclass return type
        return this;
    }*/
    @Override
    Rock hello() { // we can also override method using superclass return type
        return  this;
    }

  /*  @Override
    void hello() { // can't override using void, string,int,double etc return type, the return must be super or parent return type
        System.out.println("hi");
    } */
    @Override
    String hi() { // since the return type of hi is object in super class, it can be override using String
        return "hi";
    }
}
