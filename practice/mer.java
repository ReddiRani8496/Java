import java.util.Arrays;
class mer{
    public static void main(String[] args){
        int a[]={1,2,3,7};
        int b[]={4,5,6};
        int c[]=new int[a.length+b.length];
        int i,j,k;
        for( i=0,j=0,k=0;i<a.length&&j<b.length;){
            if(a[i]<b[j]){
                c[k++]=a[i];
                i++;
            }
            else{
                c[k++]=b[j];
                j++;
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length)
         c[k++]=b[j++];
        System.out.println(Arrays.toString(c));
    }
}