public class ShallowCopy {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.a = 10;
        add.b = 20;
        Addition add1 = add;
        add1.a = add.a;
        add1.b = add.b;
        System.out.println(add1.a);
        System.out.println(add.a);
        add1.a = 50;
        System.out.println(add1.a);
        System.out.println(add.a); // In shallow copy changes made in the one object will reflect on other obect
    }
}
class Addition {
    int a;
    int b;
}