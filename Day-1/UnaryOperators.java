class UnaryOperators{
 public static void main(String[] args){
  int a=1,b,c;
  b=++a + a++ * ++a; // postfix and prefix
  c=--a + a--;
  System.out.println("a="+a);
  System.out.println("b="+b);
  System.out.println("c="+c);
  }
 }