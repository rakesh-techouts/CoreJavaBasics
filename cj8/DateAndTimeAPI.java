package javabasics.cj8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPI {
    static void main() {
        LocalDate date = LocalDate.now();
        System.out.println("Date: "+date); //YYYY-MM-DD

        LocalTime time = LocalTime.now();
        System.out.println("Time: "+time); //HH:mm:ss

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: "+dateTime); //yyyy-mm-ddTHH:mm:ss.milli

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy  HH:mm:ss");
        System.out.println("Date and Time with Formate: "+dateTime.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter1= DateTimeFormatter.ofPattern("HH-mm-ss");
        System.out.println("Date and Time with Formate: "+dateTime.format(dateTimeFormatter1));


        System.out.println("Zoned Date and Time: "+ ZonedDateTime.now());
    }
}
