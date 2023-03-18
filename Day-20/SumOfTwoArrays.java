class SumOfTwoArrays{
    public static void main(String[] args){
        int a[]={1,2,3,4};
        int b[]={5,6,7};
        int sum=0;
        int i,j;
        for(i=0,j=0;i<a.length&&j<b.length;i++,j++){
            sum += a[i]+b[j];
        }
        while(i<a.length)
         sum+=a[i++];
         while(j<b.length)
         sum+=b[j++];
         System.out.println(sum);

    }
}