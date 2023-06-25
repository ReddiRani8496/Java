import java.io.FileNotFoundException;

public class Finalize {
    public static void main(String[] args) throws  Exception{
        Student4 s1 = new Student4();
        Student4 s2 = new Student4();
        Student4 s3  = new Student4();
        s3=null;
        System.gc(); // before destroying an object finalize method is called by the garbage collector, but not JVM
        Runtime.getRuntime().gc();
        Student4 s4 = new Student4();

    }
}
class Student4{
    static  int id;
    Student4() throws FileNotFoundException {
        id = id+1;
        System.out.println(id);
    }

    @Override
    protected void finalize() throws Throwable {
        id = id-1;
    }
}
