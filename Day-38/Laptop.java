class Laptop{
  public static void main(String[] args){
      HP h1=new HP();
    h1.color("silver");
    h1.reading();
    h1.play();
      
    }
}
class HP{
  String color;
  int storage;
  double price;
 String color(String str){
    System.out.println("color="+str);
    return str;
  }
   void reading(){
    System.out.println("reading or practicing programs ");
  }
  void play(){
    System.out.println("playing movies");
  }
}
