class UnderFlow{
    public static void main(String[] args){
        short s=-32768;
        s--; //Here underflow occurs since we are 1 to the short which is out of range, so it takes the max positive range value of short 
        System.out.println(s);

    }
}