class Human{
    public static void main(String[] args){
    Person p1=new Person();
     p1.eat();
     p1.play();
     p1.sleep();
    // p1.age=10;//cannot access the private varible
  //  p1.setAge(-4);//return 1
    p1.setAge(20);//return 20
     System.out.println(p1.getAge());
     p1.setGender("female");
     System.out.println(p1.getGender());
   
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
  
 void setAge(int a){
       if(a<0)
        this.age=1;
         else
        this.age=a;
    }
    int getAge(){
      return age;
    }
    void setGender(String g ){
        if(g!="f"&&g!="m"&&g!="female"&&g!="male")
        gender="not applicable";
        else
        gender=g;
    }
    String getGender(){
        return gender;
    }

}