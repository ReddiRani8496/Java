class OrderNlogn{
    public static void main(String[] args){
        int n=64;
        for(int i=0;i<=n;i++){// time complexity is n
            for(int j=1;j<=n;j*=2) // time complexity is logn => n*logn
            System.out.println(j);
        }
    }
}