//program to count the maximum letters of a word in the given sentence
class MaxLettersInWord{
    public static void main(String[] args){
        String str="hi welcome to java programming world";
        int max=Integer.MIN_VALUE;
        int n=str.length();
        int start =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
            start++;
            if(str.charAt(i)==' '||i==n-1){
                if(start>max)
                max=start;
                start=0;
            }
        }
        System.out.println(max);
        }
    }
