class Vehicle{
    public static void main(String[] args) {
        Cars.type();
       // Cars.Audi in=new Cars().new Audi();
        //in.show();
        Cars.Audi.show();
    }
}
class Cars{
    int x=10;
    static void type(){
        System.out.println("This is a outerclass");
    }
 static class Audi{
    public static void show(){
        System.out.println("This is inner class");
    }
 }
 /*class Benz{
    static void display(){ //we can declare method as static,if the inner class is static
        System.out.println("This is benz car");
    }
 }*/
   
}

