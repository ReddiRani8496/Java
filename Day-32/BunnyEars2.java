//program to count the total ears of bunnies, if the count of bunnies is odd(1,3,5...) each bunny has 2 ears, if even each bunny have 3 ears.
class BunnyEars2{
    public static void main(String[] args){
        int bunnies=3;
       int result= bunnyEars2(bunnies);
       System.out.println(result);
    }
    static int bunnyEars2(int bunnies){
        if(bunnies==0)
        return 0;
        if(bunnies%2==0)
        return 3+bunnyEars2(bunnies-1);
        return 2+bunnyEars2(bunnies-1);
     }
}