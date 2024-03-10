public class ReverseWordsInString {
    public String reverseWords(String s) {
        String words[] = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--) {
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        while (n != 0) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            n--;
        }
    }
    
}
