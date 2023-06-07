import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@isADuck
public class Duck {
      int x;
    protected int y;
    private  int z=5;
    private void run() {
        System.out.println("Run fast");
    }



    public Duck() { // make sure that constructor must be public

    }
    public int getZ() {
        return z;
    }
    public Duck(int x, int y){

    }
    public Duck(int x,int y, int z){

    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface isADuck{

}
