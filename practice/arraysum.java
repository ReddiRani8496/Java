import java.util.Arrays;
class arraysum{
    public static void main(String[] args){
        int a[]={1,2,3};
        int b[]={4,5,6,9};
        int max=a.length>b.length?a.length:b.length;
        int c[]=new int[max];
        int i=a.length-1;
        int j=b.length-1;
        int k=0;int l=max-1;
        int sum=0;
      while(i>=0&&j>=0){
            sum=a[i]+b[j]+k;
            c[l--]=sum%10;
            k=sum/10;
            i--;j--;
      }
      if(a.length==b.length){
        System.out.println(Arrays.toString(c));
        return;
      }
      if(a.length>b.length){
        while(i>=0){
            sum=a[i]+k;
            c[l--]=sum%10;
            k=sum/10;
            i--;
        }
      }
      if(a.length<b.length){
        while(j>=0){
            sum=b[j]+k;
            c[l--]=sum%10;
            k=sum/10;
            j--;
        }
      }
      System.out.println(Arrays.toString(c));
    }
}