package javabasics.assessment3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _15DateAndTime {
    static void main() {
        LocalDate date = LocalDate.now();

        System.out.println("Date: " + date);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("YYYY-dd-MM");

        String d = date.format(f);
        System.out.println("Formated Date: " + d);
    }
}
