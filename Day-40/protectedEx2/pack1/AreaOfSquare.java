//program to find the area of square using protected varibale in same class 
package pack1;

public class AreaOfSquare {
    protected int a=10;
    protected int findArea(int s){
          return s*s;
    }
    public static void main(String[] args) {
        AreaOfSquare area=new AreaOfSquare();
        System.out.println(area.a*area.a);
        System.out.println(area.findArea(5));
    }
}
