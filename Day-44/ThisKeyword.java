public class ThisKeyword {
    public static void main(String[] args) {
       Hello h=new Hello();
    }
    static class Hello{
         Hello(){
            this(11); //calling the constructor using this keyword, a constructor must be called inside a constructor,it should be placed top in constructor.
            System.out.println("0 parameters");
        }
        Hello(int a){
            this(10,20);
            
            System.out.println("1 parameter");
          //  this(); it will throw error since it is not the first statement
        }
        Hello(int a,int b){
        
            System.out.println("2 parameters");
        }
    }
}
