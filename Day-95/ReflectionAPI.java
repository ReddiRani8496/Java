import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Reflection is just like mirror,
// without looking back, you are able to see whats in the back using a mirror
//now we are using the fields,methods,annotations,constructors without looking it
public class ReflectionAnnotation {
    
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

      Duck duck = new Duck();

        Field[] fields = duck.getClass().getDeclaredFields();

        for(var x: fields)
            System.out.println(x); // we will get all declared fields with their type and name

        for(Field x : fields)
            System.out.println(x.getName()); // we will get only the names of the fields

        Method[] methods = duck.getClass().getDeclaredMethods();

        for(var x: methods)
            System.out.println(x); // we will get all the declared methods with their type and name

        for(var x : methods)
            System.out.println(x.getName()); // we will get only the names of the methods

        Constructor[] constructors = duck.getClass().getDeclaredConstructors();

        for(var x: constructors)
            System.out.println(x); // we will get all the declared constructors with their type and name

        for (var x: constructors)
            System.out.println(x.getName()); // we will get all the constructor names

        Annotation[] annotation = duck.getClass().getAnnotations();

        for(var x : annotation)
            System.out.println(x); // get all the annotations in the duck class

        System.out.println(duck.getZ());
        // accessing all instance and private variables and setting values to them

        for(Field x: fields) {
            if (x.getName().equals("z")) {
                x.setAccessible(true);
                x.set(duck,45); // modifying the value of z

            }
        }
        System.out.println(duck.getZ()); // returns 45

        // calling private methods outside the class
        for (Method x : methods){
            if(x.getName().equals("run")){
                x.setAccessible(true);
                x.invoke(duck);
            }
        }
        // instead of creating object for duck class we can also access fields,methods,constructors,annotations by using Class Object
        Class c = Duck.class;

        for(var x : c.getDeclaredConstructors())

            System.out.println(x);

        for (var x : c.getDeclaredMethods())

            System.out.println(x);

        for(var x : c.getDeclaredAnnotations())

            System.out.println(x);

        for(var x : c.getDeclaredFields())

            System.out.println(x);
    }
}
