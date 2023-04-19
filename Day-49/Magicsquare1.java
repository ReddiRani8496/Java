public class Magicsquare1 {
    static int a[][]={
        {5,3,4},
       {9,1,4},
       {8,6,2}
    };
    public static void main(String[] args) {
        do{
            swapCells();
        }while(!isMagicSquare());
        display();
    }
    public static boolean isMagicSquare(){
        int reqSum=a[0][0]+a[0][1]+a[0][2];
        //compare rows
        for(int i=0;i<3;i++){
            if(a[i][0]+a[i][1]+a[i][2]!=reqSum)
            return false;
        }
        //compare columns
        for(int i=0;i<3;i++){
            if(a[0][i]+a[1][i]+a[2][i]!=reqSum)
            return false;
        }
        return (a[0][0]+a[1][1]+a[2][2]==reqSum && a[0][2]+a[1][1]+a[2][0]==reqSum);

    }
    static void swapCells(){
        int firstRow=(int)(Math.random()*3.0);
        int firstCol=(int)(Math.random()*3.0);
        int secondRow=(int)(Math.random()*3.0);
        int secondCol=(int)(Math.random()*3.0);
        int temp=a[firstRow][firstCol];
        a[firstRow][firstCol]=a[secondRow][secondCol];
        a[secondRow][secondCol]=temp;
    }
    static void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
