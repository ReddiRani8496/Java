//program to find the length of a number using recursion
class NumberLength{
    public static void main(String[] args){
        int num=43043;
        System.out.println(numberLength(num));
    }
    static int numberLength(int num){
        if(num==0)
        return 0;
        return 1+numberLength(num/10);
    }
}