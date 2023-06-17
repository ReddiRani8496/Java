public class EnumString {
    public static void main(String[] args) {

        System.out.println(Cars.FORD.toString());

    }
}
enum Cars {
    AUDI {

        // overriding toString() for AUDI

        public String toString() {

            return "This is Audi car";

        }
    },

    FORD {

        // overriding toString() for FORD

        public String toString() {

            return "This is ford car";

        }
    };
}