/*program to print the following pattern
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
class Number_Pattern6{
    public static void main(String[] args){
        int n=5; 
        for(int i=1;i<=n;i++){
            int start =n;
         for(int j=1;j<=i;j++){
         
         System.out.print(start+" ");
         
         start--;
        }
        System.out.println();
        }
    }
}