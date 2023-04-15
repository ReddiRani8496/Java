public class InterfaceEx {
    public static void main(String[] args){
           Duck d=new Duck();
           d.nick();
    }
}
interface Animal{
    public void nick();
}
class Duck implements Animal{
    public void nick(){
        System.out.println("nick");
    }
}
