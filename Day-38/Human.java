import java.util.Scanner;
class Human{
    public static void main(String[] args){
    Person p1=new Person();
     p1.eat();
     p1.play();
     p1.sleep();
    // p1.age=10;//cannot access the private varible
    p1.setAge(22);
     System.out.println(p1.getAge());
   
    }
}
class Person{
    String name;
   private int age;
    String gender;
   private String phno;
    void eat(){
        System.out.println("eating food");
    }
    void play(){
        System.out.println("palying games");
    }
    void sleep(){
        System.out.println("sleeping");
    }
   String phno(String str){
        return str;
    }
   void setAge(int a){
        this.age=a;
    }
    int getAge(){
      return age;
    }

}