import java.util.Arrays;
class Union{
    public static void main(String[] args){
        int a[]={1,2,3,4};
        int b[]={5,3,8,2};
        int c[]=new int[a.length+b.length];
        int i;
        for( i=0;i<a.length;i++){
            c[i]=a[i];
        }
            for(int l=0;l<a.length;l++){
        for(int j=0;j<b.length;j++){
            if(a[l]!=b[j])
            c[i++]=b[j];
        }
        }
        
        System.out.println(Arrays.toString(c));
    }
}