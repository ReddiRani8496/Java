public class VariableScope {
    static int a = 10;
    static int b;
    public static void main(String[] args) {
        printNum(a);
        System.out.println(a); // still 10 is printed, the modified value scope is within block
        printNum1(a);
        System.out.println(a); // 39 will be printed, in printNum1 method static variable is changing
      //  num(a); non-static method cannot be referenced from a static context
        
        int b;
     //   System.out.println(b);// error b is present in local scope, so it is considered, value might not have been initialized
    }
    public static void printNum(int a) {
        a=39;
    }
    public static void printNum1(int x) {
        a=39;
    }
    
    public void num(int a){
        a = 10;
    }
}

