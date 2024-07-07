package javaapis.datetime;

import java.time.LocalDateTime;

public class DateSample01 {

    public static void main(String[] args) {
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime nextWeek=dateTime.plusWeeks(1);
        System.out.println(dateTime);


        }

}
