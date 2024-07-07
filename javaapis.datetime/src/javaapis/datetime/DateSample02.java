package javaapis.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample02 {

    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyy/MM/dd");
        String str=dateTime.format(formatter);
        System.out.println(str);



    }

}
