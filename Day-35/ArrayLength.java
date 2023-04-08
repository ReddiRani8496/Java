class ArrayLength{
    public static void main(String[] args){
        int arr[]={1,2,4};
        int length=0;
        
        System.out.println(arrayLength(arr));
    }
    static int arrayLength(int arr[]){
        if(arr.length==0)
        return 0;
        return 1+arrayLength(arr.length-1);
    }
}