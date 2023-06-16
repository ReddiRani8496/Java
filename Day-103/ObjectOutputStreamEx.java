import java.io.*;

public class ObjectOutputStreamEx {


    public static void main(String[] args) throws IOException {

        Bank[] customers ={new Bank("john",23,54000),
                           new Bank("king",28,49000),
                           new Bank("David",27,65000) };
        
        FileOutputStream fos = new FileOutputStream("CustomerData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(customers.length);
        for (int i = 0; i < customers.length; i++)
            oos.writeObject(customers[i]);
        oos.close();
        fos.close();
    }
}
class Bank implements Serializable {
    String name;
    int age;
    double balance;
    Bank(){}
    Bank(String name,int age,double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
}
