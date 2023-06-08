import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)

@Repeatable(VIPContainer.class) // annotation of repeatable interface

@interface VIP {
    int rating() default  1;
    String star();
    String status="Very important person";

}
@Retention(RetentionPolicy.RUNTIME)

@interface VIPContainer { // repeatable interface
    VIP[] value();
}
