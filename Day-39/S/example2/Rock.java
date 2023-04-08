package example2;

public class Rock {
   private int c=10;//we can access variable c, within the class
   public int d;
   public static void main(String[] args) {
       int a=20;
   int b=10;
  
    Rock r=new Rock();
   System.out.println(a);
   System.out.println(b);
   System.out.println(r.c);
}
}
