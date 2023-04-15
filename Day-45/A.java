public class A {
    public static void main(String[] args) {
        new B().show();  //creating constructor and calling show method
    }
}
class B{
    B(){
      System.out.println("something");
    }
    int a;
    void show(){
        System.out.println("show man");
    }
}
