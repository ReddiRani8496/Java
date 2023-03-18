/* program to add two arrays
a={1,2,3};
b={4,5,6};
sum={1+4=5,2+5=7;3+6=9}
sum={5,7,9}
*/
import java.util.Arrays;
class TwoArraysSum{
    public static void main(String[] args){
        int a[]={1,2,3};
        int b[]={7,9,5,6};
        int max=a.length>b.length?a.length:b.length;
        max-=1;
        int c[]=new int[max+1];
        int i,j;
        int k=0;
        int sum=0;
         i=a.length-1;
        j=b.length-1;
        while(i>=0&&j>=0){
            sum=a[i]+b[j]+k;
            c[max]=sum%10;
            k=sum/10;
            max--;i--;j--;
        }
        if(a.length==b.length){
        System.out.println(Arrays.toString(c));
        return;
    }
    else if(a.length>b.length){
        while(i>=0){
            sum=a[i]+k;
            c[max]=sum%10;
            k=sum/10;
            max--;i--;
            
        }
        }
        else{
            while(j>=0){
                sum=b[j]+k;
                c[max]=sum%10;
                k=sum/10;
                max--;j--;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}