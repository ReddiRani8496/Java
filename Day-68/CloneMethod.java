public class CloneMethod implements Cloneable {
    private int rno;
    private String sname;
    public int getrno() {
        return rno;
    }
    public void setrno(int rno) {
        this.rno = rno;
    }
    public String getSName() {
        return sname;
    }
    public void setSName(String sname) {
        this.sname = sname;
    }
    public CloneMethod(int rno, String sname) {
        super();
        this.rno = rno;
        this.sname = sname;
    }
    public static void main(String[] args) throws CloneNotSupportedException {

        CloneMethod cm = new CloneMethod(1, "clone");

        CloneMethod cm2 = (CloneMethod) cm.clone();

        cm.setSName("java");

        System.out.println(cm.getrno()+" "+cm.getSName()); 
        
        System.out.println(cm2.getrno()+" "+cm2.getSName()); // updates will not be effected on the clone method.
    }
}
