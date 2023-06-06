public class WhyAnnotation {
    public static void main(String[] args) {

        
        
    }    
}
class Hello {

     void hi() {

        System.out.println("Hi");

    }
}
class Hi extends Hello{

    //static void hii() { // we are overriding the method but it is not same as parent class method so it leads to error when we override
    
    @Override
    void hi() {
        
        super.hi();
    }
       
}
