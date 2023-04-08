class elesum{
    public static void main(String[] args){
        int a[]={1,2,3};
        int b[]={4,5,6};
        int sum=0;
        for(int i=0,j=0;i<a.length&&j<b.length;i++,j++){
            
                sum=sum+a[i]+b[j];
            
        }
        System.out.println(sum);
    }
}



