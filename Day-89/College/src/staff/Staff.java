package staff;

public class Staff {

    public String name;
    public int salary;
    GENDER gender;
    public int contantNum;

    public int getContantNum() {
        return contantNum;
    }

    public void setContantNum(int contantNum) {
        this.contantNum = contantNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", contantNum=" + contantNum +
                '}';
    }
}
