public class MethodChaining {
    public static void main(String[] args) {
        
        Caluculator caluculator = new Caluculator();

      //  caluculator.add(10,20).sub(10,20); // we can not form chain, first add() returns 30, then 30.sub(10,20), no object 30 found
        
        caluculator.add(10, 20).sub(10, 30).div(20, 10).mul(40,2);

    }
}
class Caluculator {

    //int add(int a,int b) {

    Caluculator add(int a, int b) {

        System.out.println("Performing addition");

        return this; // returns the address of the Caluculator
    } 

    //int sub(int a, int b) {

    Caluculator sub(int a, int b) {

        System.out.println("Performing subtraction");

        return this;
    }

   // int mul(int a, int b) {
    Caluculator mul(int a, int b) {

        System.out.println("Performing multiplication");

        return this;
    }

    //int div(int a, int b) {
    Caluculator div(int a, int b) {

        System.out.println("Performing division");

        return this;
    }
}
