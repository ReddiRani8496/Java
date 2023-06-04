public class MainMethodEx {

  //  static public void main(String[] args) // we can declare main method as static public 

  // static void public main(String[] args) // we can't declare like this, before the method type there must be return type

  // static public void main(String[] a) // instead of args we can declare any name

  // static public void main(int[] a) // we can declare array type as int, double, float etc but it is not consider as starting point of execution,
    
  public static void main(int[] a){

    System.out.println("hi"); // to execute this method we have to explicitly call this method

  }  
  public static void main(String[] args) { // only this method executed by jvm implicitly

    System.out.println("Hello");

    // MainMethodEx.main(args); // calling the main method inside the main method leads to stackoverflow error

    int[] a ={1,23}; 

    main(a); // calling main method with integer array explicitly

  }

    
        
    
}
