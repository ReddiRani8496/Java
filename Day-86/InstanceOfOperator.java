/*
 * instanceof is a binary operator we use to test if an object is of a given type. 
 * 
 * The result of the operation is either true or false.
 * 
 * It's also known as a type comparison operator because it compares the instance with the type.
 */

public class InstanceOfOperator {
      public static void main(String[] args) {

          Car car = new Ford();

          boolean res = car instanceof Ford;

          System.out.println(res);

          res = car instanceof Kia;

          System.out.println(res);

          Car car1 = new Kia();

          res = car1 instanceof Kia;

          System.out.println(res);

          res = car1 instanceof Ford;

          System.out.println(res);

          Car car2 = new Car();

          res = car2 instanceof Car;

          System.out.println(res);

          res = car2 instanceof Ford;

          System.out.println(res);

          res = car2 instanceof Kia;
      }
  }
  
  class Car {
    
  }
  class Ford extends  Car {
    
  }
  
  class  Kia extends  Car {

  }

