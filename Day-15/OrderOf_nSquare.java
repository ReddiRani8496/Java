class OrderOf_nSquare{
    public static void main(String[] args){
        int n=100000;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++)
             System.out.println(j); // time complexity is O(n^2)
        }
    }
}