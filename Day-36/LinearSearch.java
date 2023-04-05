//program to find the element in the array using recursion
class LinearSearch{
    public static void main(String[] args){
        int arr[]={1,3,4,5};
        int element=5;
        int eind=arr.length-1;
        System.out.println(findElement(arr,element,eind));
    }
    static boolean findElement(int arr[],int element,int eind){
        if(eind==0)
        return false;
        if(arr[eind]==element)
        return true;
        return findElement(arr,element,eind-1);
    }
}