public class ObjectEx {
    public static void main(String[] args) {

        Nick nick = new Nick();

        System.out.println(nick.hashCode());
    }
}
class Duck { // extends the Object class 

}
class Nick extends Duck { // Nick contains both duck and object class properties
    
    int x;
    
}
