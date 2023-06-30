public class StrictfpInterfaces implements Car{
    public strictfp void calculateSpeed() { // stictfp applied on a concrete methods
        double speed = 2;
        double distance = 5.5;
        double time = (speed/distance);
        System.out.println(time);
    }
}
strictfp interface Car { // strictfp can be used with interfaces

    //strictfp void calculateSpeed();// since methods of an interface are implicitly abstract,
                                    // strictfp keyword cannot be used with any method inside interface

    void calculateSpeed();
}
