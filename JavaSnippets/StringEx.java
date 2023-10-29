public class StringEx {
    public static void main(String[] args) {
        String str = "hello", str1 = "hi";
        int x = 10, y = 15;
        System.out.println(str); // hello
        System.out.println(x+y); // 25
        System.out.println(str+x); // hello10
        System.out.println(str+x+y); // hello1015
        System.out.println(x+str); //10hello
        System.out.println(x+y+str); //25hello
        System.out.println(str+x*y); //hello150 first x*y high priority will be performed then concatenation performed
    //    System.out.println(str+x-y); cannot subtract form string
        System.out.println(str+str1+x+y); // hellohi1015
    }
}

