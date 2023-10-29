public class AbstractMethodEx {
    public static void main(String[] args) {
        Mock m = new Mike();
        m.sing(); // Mike is singing
        //m.dance; cannot access the child method, only parent class methods can access
    }
}

class Duck {
    //abstract void sing(); // the abstract declared in abstract class
}
abstract class Mock {
    abstract void sing();
}

 class Mike extends Mock{
    @Override
    void sing() {
        System.out.println("Mike is singing");
    }

    void dance() {
        System.out.println("Mike is dancing");
    }
}

