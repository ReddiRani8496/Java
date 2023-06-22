public class Addition {

    public static void main(String[] args) {

        int a = 1;

        int b = 2;

        int firstResult = add(a,b);

        int secondResult = add(a,firstResult);

        System.out.println(firstResult);

        System.out.println(secondResult);

    }
    public static int add(int a,int b) {

        return a+b;

    }
}
