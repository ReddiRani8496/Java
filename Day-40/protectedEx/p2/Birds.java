package p2;
import p1.Duck; // import Duck class from package p1
public class Birds extends Duck { // class Birds is super class and duck is subclass
    public static void main(String[] args) {
        Birds b=new Birds(); 
        b.sound();
    }
}
