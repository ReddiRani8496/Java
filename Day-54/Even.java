public class Even {
    public static void main(String[] args) {

        for(var x : args) {

            int num = Integer.parseInt(x);

            int rem = num%2;

            if(rem == 0)

                System.out.println("Even" + num);

            else  

                System.out.println("Odd" + num);
            
        }
    }
    
}
  