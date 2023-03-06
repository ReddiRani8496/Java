class Multi_Dimensional_Array{
    public static void main(String[] args){
        int arr[][][]={{{1,2}, {2,3}},{ {3,4},{4,5}}};
        for(int x[][] :arr){
            for(int y[]:x){
                for(int z:y){
                    System.out.print(z);
                }
                System.out.println();
            }
        }
        
    }
}