class Animal{
    public static void main(String[] args){
     Dog d1=new Dog();
     d1.breed="german";
     d1.price=5000.50;
     d1.color="brown";
     System.out.println("breed="+d1.breed);
     System.out.println("price="+d1.price);
     System.out.println("color="+d1.color); 
    }
}
class Dog{
    String breed;//attributes
    double price;//attributes
    String color;//attributes
   }