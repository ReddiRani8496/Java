//program to compare performance of  String literal and String object
class StringLiteralAndObject {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        System.out.println(start1);
        for(int i=0;i<100000000;i++){
            String str1 = "hello"; //String literal
            String str2 = "world"; //String literal
        }
        long end1 = System.currentTimeMillis();
        long total_Time = end1 - start1;
        System.out.println("Time taken to execute string literal: "+total_Time);
        long start2 = System.currentTimeMillis();
        for(int i=0;i<1000000000;i++){
            String str3 = new String("Hello"); //String object
            String str4 = new String("World"); //String object
        }
        long end2 = System.currentTimeMillis();
        long total_Time1 = end2 - start2;
        System.out.println("Time taken to execute Sting object: "+total_Time1);

    }
}