import java.util.Arrays;
class PassByReference{
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        System.out.println(Arrays.toString(arr));//{1,2,3,4} 
        add(arr);
        System.out.println(Arrays.toString(arr));//{2,3,4,5}
    }
    static void add(int arr1[]){
        for(int i=0;i<arr1.length;i++)
         arr1[i]=arr1[i]+1;
        System.out.println(Arrays.toString(arr1));//{1+1,2+1,3+1,4+1}=>{2,3,4,5}

    }
}