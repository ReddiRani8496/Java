public class RunTimePolymorphism1 {
    public static void main(String[] args) {
     subclass1 s1=new subclass1();
       s1.print();
       subclass2 s2=new subclass2();
       s2.print();

    }
}
class Parent{
    void print(){
        System.out.println("Parent class");
    }
}
class subclass1 extends Parent{
   /*  void print(){
        System.out.println("subclass1");
    }*/
}
class subclass2 extends Parent{
    void print(){
        System.out.println("subclass2");
    }
}
