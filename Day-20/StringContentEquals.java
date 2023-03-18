class StringContentEquals{
    public static void main(String[] args){
        String str="hello, welcome to java world";
        System.out.println(str.contentEquals("hello, welcome to java world"));
        System.out.println(str.contentEquals("hello,java world"));
    }
}