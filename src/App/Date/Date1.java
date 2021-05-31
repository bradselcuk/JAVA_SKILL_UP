package App.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date1 {
    public static void main(String[] args) {

        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);

        LocalDate myObj1 = LocalDate.now();
        System.out.println(myObj1);
        System.out.println("********************");
        LocalDateTime myObj2 = LocalDateTime.now();
        DateTimeFormatter myObj2Formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newFormattedDate = myObj2.format(myObj2Formatted);
        System.out.println(newFormattedDate);


    }

}
