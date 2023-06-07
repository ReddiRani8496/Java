/* 
 * Annotations can be used in 6 places
 * constructor level
 * parameters level
 * class level
 * method level
 * instance variable level
 * local variable level
 */

@isAProgrammer
class UserDefinedAnnotation {

    @isAProgrammer
    int c = 10;

    @isAProgrammer
    public static void main(@isAProgrammer String[] args) {

       @isAProgrammer
        int a =10;

    }

    @isAProgrammer
    UserDefinedAnnotation() {

    }
}

@interface isAProgrammer{

}
// class -- @interface