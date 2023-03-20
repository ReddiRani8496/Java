//program to find the sum of four elements in the array is equal to the given sum
class Quadruplet{
    public static void main(String[] args){
        int arr[]={8,3,4,9,1,5,12,14,18,20,7};
        int sum=22;
        int len=arr.length;
        for(int i=0;i<len-3;i++){
            for(int j=i+1;j<len-2;j++){
                for(int k=j+1;k<len-1;k++){
                    for(int m=k+1;m<len;m++){
                        if(arr[i]+arr[j]+arr[k]+arr[m]==sum){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[m]);
                        return;
                        }
                    }
                }
            }
        }
    }
}