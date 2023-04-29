//program to caluculate the period in years, how many years passed since the independence in India

import java.time.LocalDate;

public class YearsPassed {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate independenceDate = LocalDate.of(1947,8, 15);

        int years = today.getYear()- independenceDate.getYear();

        System.out.println(years);

    }
}
