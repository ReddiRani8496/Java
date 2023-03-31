//program to find out number of ears across all the bunnies recursively, where each bunny has 2 ears
class BunnyEars{
    public static void main(String[] args){
        int bunnies=3;
       int total= bunnyEars( bunnies);
       System.out.println(total);
    }
    static int bunnyEars(int bunnies){
        if(bunnies==0)
        return 0;
        return 2+bunnyEars(bunnies-1);
    }
}