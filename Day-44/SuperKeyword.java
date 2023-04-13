

public class SuperKeyword {
    public static void main(String[] args) {
        Rock r=new Rock();
        
    }
}
class Stone{
    Stone(){ //third step
        this(10);// calling the same class constructor with 1 parameter
        System.out.println("stone 0");
    }
    Stone(int x){
        System.out.println("stone 1");
    }
}
class Rock extends Stone{
    Rock(){ //first statement executed after constructor call
        super();//calling the super class constructor with no parameters
        System.out.println("0 parameters");
    }
    Rock(int x){
        System.out.println("1 parameter");
    }
}
