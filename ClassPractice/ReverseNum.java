package ClassPractice;
public class ReverseNum {
    public static void main(String[] args) {
        int num = 123;
        int ans = 0;
        System.out.println(reverse(num,ans));
    }

    private static int reverse(int number, int ans) {
        if(number == 0)
            return ans;
        
        ans = (ans*10) + (number%10);
        
        return reverse(number/10, ans);
    }
}
