public class CodeOptimization {
    public static void main(String[] args) {
        int a = 10;
        if(++a > 9 || ++a < 5)
            System.out.println(a); // 11 in the above condition 1st condition true, so next condition will not be checked
        int c = 10;
        if(++c > 9 && ++c < 50)
            System.out.println(a); // 12 in logical and if 1st condition true, 2nd condition also checked

        int b = 10;

        int sum = ++b + ++b + b++;
        System.out.println(sum); // 35
        System.out.println(b); // 13

    }
}

