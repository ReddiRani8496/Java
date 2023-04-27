public class DryExample {
    static void college() {
        System.out.println("SV University");
    }
    static void CSE() {
        System.out.println("This is computer science");
        college();
    }
    static void ECE() {
        System.out.println("This is Electronics");
        college();
    }
    static void Civil() {
        System.out.println("This is civil engineering");
        college();
    }
    public static void main(String[] args) {
        CSE();
        ECE();
        Civil();
    }
}

