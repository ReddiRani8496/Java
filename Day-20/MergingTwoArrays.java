import java.util.Arrays;
class MergingTwoArrays{
    public static void main(String[] args){
        int a[]={1,2,3,4,9};
        int b[]={5,6,7,8};
        int max=a.length>b.length?a.length:b.length;
        int c[]=new int[a.length+b.length];
        int i,j,k;
        for(i=0,j=0,k=0;i<a.length&&j<b.length;){
            if(a[i]<b[j])
              c[k++]=a[i++];
              else 
              c[k++]=b[j++];
         }
         while(i<a.length)
         c[k++]=a[i++];
         while(j<b.length)
         c[k++]=b[j++];
         
         System.out.println(Arrays.toString(c));
    }
}