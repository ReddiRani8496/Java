//program to implement interface in anonymous class
public class InterfaceEx2 {
 public static void main(String[] args) {
    Rock r=new Rock() {
        public void duck(){
            System.out.println("duck duck");
        }
    };
    r.duck();
 }   
}
interface Rock{
    public void duck();
}
