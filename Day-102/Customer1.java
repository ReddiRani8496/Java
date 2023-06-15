import java.io.*;

public class Customer1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("rock.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        SBI sbi = new SBI(br.readLine());

        sbi.setBalance(Double.parseDouble(br.readLine()));// In file data is considered as text, so we need to type cast the data

        sbi.setMinbalance(Integer.parseInt(br.readLine()));

        System.out.println(sbi.getName());

        System.out.println(sbi.getBalance());

        System.out.println(sbi.getMinbalance());

    }
}
