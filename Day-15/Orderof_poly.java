class Orderof_poly{
    public static void main(String[] args){
        int n=100;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                for(int k=0;k<=n;k++)
                System.out.println(k); // time complexity is O(n^3), tis statement executes 100*100*100=1000000 times
            }
        } 
    }
}