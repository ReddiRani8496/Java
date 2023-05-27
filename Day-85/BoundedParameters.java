public class BoundedParameters {
    public static void main(String[] args) {

        getNum(69);

        getNum(9999.45);

        getNum(3243.98f);

        getNum(567345465L);

       // getNum("NUMBER"); String can't be passed, it accepts only numbers

       // getNum('c');

       // getNum(true);

    }

    public  static<T extends Number> void getNum(T num) {

        System.out.println("Number is "+num);
        
    }
}
