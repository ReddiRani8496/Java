public class StaticBlock {
    public static void main(String[] args) {
        Test t1=new Test(); //static block is called only once, alothough there are two or more objects
        Test t2=new Test();
        Test t3=new Test();
    }
}
class Test{
    static int i;
    static{
        i=10;
        System.out.println("static block called");
    }
    Test(){
        System.out.println("constructor called");
    }
}
