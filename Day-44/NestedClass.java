public class NestedClass {
 public static void main(String[] args) {
    Outer.Inner in=new Outer().new Inner();
    in.show();
 }    
}
class Outer{
    //simple nested inner class
    class Inner{
        //show() method of inner class
        public void show(){
            System.out.println("In a nested class method");
        }
    }
}
