class Alphabet_Pattern{
    public static void main(String[] args){
        int n=10;
       for(int i=1;i<=(n/2);i++)
        System.out.print("*");
        System.out.println();
        for(int i=1;i<=(n/2)-1;i++)
         System.out.println("*");
          for(int i=1;i<=(n/2);i++)
          System.out.print("*");
          System.out.println();
          for(int j=1;j<=(n/2)-1;j++){
          for(int i=1;i<=(n/2)-1;i++){
          System.out.print(" ");
          }
           System.out.println("*");
    }
           for(int i=1;i<=(n/2);i++)
        System.out.print("*");
        System.out.println();
   }
}