public class ThisEx {
    public static void main(String[] args) {
     A a=new A();   
    
    B b=new B();
    }
}
class A{
    int rock;
    B bb;
    A(){}
    A(B b){
        System.out.println(b.bval);
    }
    int grocery(){
        System.out.println("grocery");
        return 5;
    }
    B b=new B(this);
}
class B{
    int bval=10;
    A a;
    B(){}
    B(A x){
        System.out.println(x.grocery());
      // A a=new A(this);//we can't implement A constructor here, this will implements unlimited times
    }
 
     
}
