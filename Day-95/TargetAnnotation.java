/*
 * Target annotation can be applied to following element types:
 * field
 * method
 * constructor
 * local_variable
 * annotation_type
 * package
 * type_parameter
 * parameter
 */
import java.lang.annotation.ElementType;

import java.lang.annotation.Target;

class TargerAnnotation {

    @isAProgram
    TargerAnnotation() {
        
    }

    //@isAProgram // if we apply for method, it throws error, can't be applied for method

    @VIP // we can apply VIP annotation to methods
    public static void main(String[] args) {

        @VIP // we can apply VIP annotation for local variables
        @SuppressWarnings("Unused")
        int a = 10;
        
    }
}

@Target(ElementType.CONSTRUCTOR) // we can apply this annotation only for constructor

@interface isAProgram {
    
}

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE}) // we can fix the access of annotation to multiple elements at a time

@interface VIP{
    
}

