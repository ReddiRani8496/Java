package students;

public class Student {
    private String StudentName;
    private int age;
    private int rollNumber;
    private String section;
    private long applicantID;

    private Gender gender;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public long getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(long applicantID) {
        this.applicantID = applicantID;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", section='" + section + '\'' +
                ", applicantID=" + applicantID +
                ", gender=" + gender +
                '}';
    }
}
