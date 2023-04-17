public class Rock {
    public static void main(String[] args) {
      Rock1 r1=new Rock1();
      Rock1 r2=new Rock1();
      Rock1 r3=new Rock1();
      System.out.println(r3.x);  
    }
}
class Rock1{
    static  int x;
    Rock1(){
        x++;
    }
}