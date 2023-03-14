class SpaceComplexity_n{
    public static void main(String[] args){
        int n=100; // space O(100)=>O(1)
        int arr[]=new int[n];//space O(n)=>O(1)+O(n)=>O(n)
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}