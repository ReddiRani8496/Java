public class Servents {

    private String name;
    private String educations;
    private int age;
    private int salary;
    SHIFT shift;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducations() {
        return educations;
    }

    public void setEducations(String educations) {
        this.educations = educations;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public SHIFT getShift() {
        return shift;
    }

    public void setShift(SHIFT shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Servents{" +
                "name='" + name + '\'' +
                ", educations='" + educations + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", shift=" + shift +
                '}';
    }
}
enum SHIFT {
    MORNING,NIGHT
}