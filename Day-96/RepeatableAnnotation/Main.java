import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        VIP[] vipContainers = Modi.class.getAnnotationsByType(VIP.class);

        System.out.println(vipContainers[0]);

        System.out.println(vipContainers.length);

        System.out.println(vipContainers[1]);

        for (int i = 0; i <vipContainers.length ; i++) {

            System.out.println(vipContainers[i]);

        }

        System.out.println(vipContainers[0].star());

        System.out.println(vipContainers[0].rating());

        System.out.println(vipContainers[1].star());

        System.out.println(vipContainers[1].rating());

        Modi modi = new Modi();

        for (Method m : modi.getClass().getDeclaredMethods()) {

            if(m.getName().equals("printVIP")) {

                VIP[] x = m.getAnnotationsByType(VIP.class);

                System.out.println(x.length);

                System.out.println(x[0].rating());

                System.out.println(x[0].star());

                System.out.println(x[1].star());

                System.out.println(x[1].rating());

            }
        }

    }
}