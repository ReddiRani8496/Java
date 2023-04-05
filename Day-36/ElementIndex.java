//program to find the index of the required element
class ElementIndex{
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        int element=11;
        System.out.println(elementIndex(arr,arr.length-1,element));
    }
    static int elementIndex(int arr[],int eind,int element){
      if(eind<0)
      return -1;
      if(arr[eind]==element)
      return eind;
      return elementIndex(arr,eind-1,element);
    }
}