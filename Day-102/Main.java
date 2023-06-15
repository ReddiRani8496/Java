import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      /*  SBI sbi = new SBI("Reddirani");
        sbi.setBalance(200000);
        sbi.setMinbalance(1000);
        System.out.println(sbi.getName()); // Here the problem is, we can't store the data for future purpose
        System.out.println(sbi.getBalance());
        System.out.println(sbi.getMinbalance());

       */
        FileOutputStream fos = new FileOutputStream("rock.txt");
        PrintStream ps = new PrintStream(fos);
        SBI john = new SBI("John");
        john.setBalance(200000);
        john.setMinbalance(500);
        ps.println(john.getName());
        ps.println(john.getBalance());
        ps.println(john.getMinbalance());
    }
}
class SBI {
    String name;
    SBI(){}
    SBI(String name){
        this.name=name;
    }
    double balance;
    int minbalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMinbalance() {
        return minbalance;
    }

    public void setMinbalance(int minbalance) {
        this.minbalance = minbalance;
    }
}