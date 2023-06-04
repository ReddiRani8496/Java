// In each java file, we can have a maximum of one public class

// and the file name should the name of the public class

public class PublicClasses {
 
    public static void main(String[] args) {

       // Duck duck = new Duck(); cannot create instance for abstract class
    }
    
}
/*public class Nick { // we cannot create more than one class as public in same file

}*/

class Nick { // the outer class can be default, the class converted to byte code when we compile the java file

}

/*private class Duck { the outer  class cannot be private

}*/


/*protected class Duck { the outer class cannot be protected 

}*/

 
abstract class Duck { // the outer class can be abstract but we cannot create the object of this class, 
                      // the class converted to byte code when we compile the java file
 
}

final class Dog { // the outer calss can be fianl but this class cannot be super class of any other class
                  // the class converted to byte code when we compile the java file
}
/*class Mock extends Dog { we cannot extend the final class

}*/