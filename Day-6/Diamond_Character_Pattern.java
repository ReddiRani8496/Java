/*program to print the following pattern
    A
   B B
  C   C
 D     D
E       E
 D     D
  C   C
   B B
    A

*/
 class Diamond_Character_Pattern{
    public static void main(String[] args){
        int n=5;
        int start=64;
        for(int i=1;i<=(n-1);i++)
        System.out.print(" ");
        System.out.println("A");
        start++;
      for(int i=2,l=1;i<=n;i++,l+=2){
        start++;
        for(int j=1;j<=(n-i);j++)
          System.out.print(" ");
          System.out.print((char)start);
        for(int k=1;k<=l;k++)
        System.out.print(" ");
        System.out.print((char)start+" ");
        System.out.println();
        
       }  
      for(int i=2,l=(n*2)-(i*i)-1;i<n;i++,l-=2){
        start--;
        for(int j=1;j<=i-1;j++)
         System.out.print(" ");
         System.out.print((char)start);
         for(int k=1;k<=l;k++)
         System.out.print(" ");
         System.out.print((char)(start));
         System.out.println();
         
       }
       for(int i=1;i<=n-1;i++)
         System.out.print(" ");
         System.out.println("A");
    }
 }