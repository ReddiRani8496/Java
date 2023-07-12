package student;

public class Student {
    private String name;
    private int id;
    private String mail;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return
                "Name: " + name  +
                        ", ID: " + id +
                        ", Email: " + mail +
                        ", GPA: " + gpa ;
    }

}
