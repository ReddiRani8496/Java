//program to display the pattern like right angle triangle using asterisk
class Rightangle_Triangle_Pattern{
    public static void main(String[] args){
        int i,j,rows;
         rows=7;
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++)
             System.out.print("*");
            System.out.println();
        }
    }
}