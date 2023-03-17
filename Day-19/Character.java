import java.util.Arrays;
class Character{
    public static void main(String[] args){
        char arr[]={'j','a','v','a'};
        System.out.println(Arrays.toString(arr));
        arr[1]='v'; // character elements are muttable

        System.out.println(Arrays.toString(arr)); 
    }
}