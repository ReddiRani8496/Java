public class InsufficientFundsExceptions {
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        try {
            atm.setBalance(30000);

          //  atm.setBalance(-3000);

            System.out.println("You can withdraw");

        } catch(Exception e) {

            System.out.println(e);

            System.out.println("Enter valid amount");
        }
    }
}

class ATM {

    private int balance;

    public int getBalance() {

        return balance;
    }
    public void setBalance(int balance) throws InsufficientFundsException{

        if(balance < 0){

            throw new InsufficientFundsException(0);
        }
        this.balance = balance; 
    }
}
class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException(int balance) {
       // super(balance);
    }
}
