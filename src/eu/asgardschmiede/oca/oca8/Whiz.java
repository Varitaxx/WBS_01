package eu.asgardschmiede.oca.oca8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Whiz {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015,12,12);
        LocalDateTime time = date.atTime(10, 22);
        System.out.println(date.getDayOfWeek() +" > " + time.getHour()+":"+time.getMinute());
    }



}



