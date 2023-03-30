class BunnyEars{
    public static void main(String[] args){
        int bunnies=1;
       int total= bunnyEars( bunnies);
       System.out.println(total);
    }
    static int bunnyEars(int bunnies){
        if(bunnies==0)
        return 0;
        if(bunnies==1)
        return 1;
        return 2*bunnies;
    }
}