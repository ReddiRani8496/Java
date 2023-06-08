import java.lang.annotation.*;

@Inherited

@Retention(RetentionPolicy.RUNTIME)

@interface BasicEngine {
    String mileage() default "20";
    String fuelType() default "BioDiesel";
}
