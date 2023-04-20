public class BruteForce {
        static int a[][]={
           {8,11,14,1}, 
            {13,2,7,12},
            {3,16,9,6},
            {10,5,4,15}
        };
        public static void main(String[] args) {
            boolean res=isMagicSquare();
            System.out.println(res);
        }
        public static boolean isMagicSquare(){
            int reqSum=a[0][0]+a[0][1]+a[0][2]+a[0][3];
            //compare rows
            for(int i=0;i<3;i++){
                if(a[i][0]+a[i][1]+a[i][2]+a[i][3]!=reqSum)
                return false;
            }
            //compare columns
            for(int i=0;i<3;i++){
                if(a[0][i]+a[1][i]+a[2][i]+a[3][i]!=reqSum)
                return false;
            }
            return (a[0][0]+a[1][1]+a[2][2]+a[3][3]==reqSum && a[0][3]+a[1][2]+a[2][1]+a[3][0]==reqSum);
    
        }
    }
    

