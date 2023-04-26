public class Prime {
    public static void main(String[] args) {

        for(var x : args) {

            int num = Integer.parseInt(x);

        if(num < 2)

            System.out.println("Number is invalid, enter the valid number");

        for(int i = 2 ; i <= (num/2) ; i++){

            if((num%i) == 0) {

                System.out.println("composite" + num);

                return;

            }

        }

        System.out.println("prime" + num);

        }
    }
}
