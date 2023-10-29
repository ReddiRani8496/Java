public class DivisibleBy3Or5 {
    public static void main(String[] args) {
//        for(int i = 1; i <= n; i++) { // n is not initialized
//            if(i%5==0)
//                System.out.println(i) // semicolon is missing
//            if(i%3==0)
//                System.out.println(i);
//        }
        int n = 20;
        for(int i = 1; i <= n; i++) {
            if(i%5 == 0)
                System.out.println(i);
//            if(i%3 == 0)
//                System.out.println(i); // it will give common factors of 5 and 3 twice
            else if(i%3 == 0)
                System.out.println(i);
        }
    }
}

