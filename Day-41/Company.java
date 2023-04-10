//program to illustrate the multilevel inheritance
class Company{
    public static void main(String[] args) {
        Ceo c=new Ceo();
        c.setName("king");
        c.setAge(30);
        c.setSalary(100000);
        c.setQualification("mtech");
        c.experience(15);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getSalary());
        System.out.println(c.getQualification());
    }
}
class Clerk{
    String name;
    int age;
    double salary;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
}
class Manager extends Clerk{
    String qualification;
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public String getQualification(){
        return this.qualification;
    }
}
class Ceo extends Manager{
    int experience;
    public void experience(int experience){
        this.experience=experience;
        System.out.println(this.experience);
    }
}
