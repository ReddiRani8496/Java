//program to illustrate the run time polymorphism
public class RunTimePolymorphism {
    public static void main(String[] args) {
       Square s=new Square();
       s.draw();
       
    }
}
class Shape{
    void draw(){
        System.out.println("Can't say shape type");
    }
}
class Square extends Shape{
    //override
   /* void draw(){
        System.out.println("square shape");
    }*/
} 
