class Max_MinElement_Array{
    public static void main(String[] args){
        int arr[]={90,23,43,65,78,32,95,98};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(var x:arr){
            if(x>max)
            max=x;
            if(x<min)
            min=x;
        }
        System.out.println("Min="+min+"\t"+"Max="+max);
    }
}