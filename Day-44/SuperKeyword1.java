public class SuperKeyword1 {
    public static void main(String[] args) {
      Dog d=new Dog();
      d.printColor();
    }    
  }
  class Animal{
      String color="white";
  }
  class Dog extends Animal{
      String color="black";
      void printColor(){
          System.out.println(color);
          System.out.println(super.color);
      }
  }
