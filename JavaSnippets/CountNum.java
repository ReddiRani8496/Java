public class CountNum {
    public static void main(String[] args) {
        CountNum c1 = new CountNum();
        CountNum c2 = new CountNum();
        CountNum c3 = new CountNum();
        c1.printNum(); // 3
        c2.printNum(); // 3
        c3.printNum(); // 3 because static is class level variable

        c1.printNum1(); //1
        c2.printNum1(); //1
        c3.printNum1(); //1
    }
    static int count;
     int num;
    CountNum() {
        count++;
        num++;
    }
    public void printNum(){
        System.out.println(count);
    }
    public void printNum1() {
        System.out.println(num);
    }

}

