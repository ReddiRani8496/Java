class Polygon{
    void display(){
        System.out.println("Inside the polygon class");
    }
}

public class AnnonymousEx {
    public static void main(String[] args) {
    Polygon p1=new Polygon(){
        void display(){
            System.out.println("Inside the annonymous class");
        }
    } ;
    p1.display();
    Polygon p2=new Polygon();
    p2.display();
}   
}
