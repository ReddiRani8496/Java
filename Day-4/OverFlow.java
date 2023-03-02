class OverFlow{
     public static void main(String[] args){
        byte b=127;
        b++;// the range of byte is -128 to 127, when we increase it value out of range, overflow occurs and print the negative value
        System.out.println(b);
     }
}