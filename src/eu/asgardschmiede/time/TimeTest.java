package eu.asgardschmiede.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {

        //java.util.Date veraltet
        // d1 = new Date();
        //em.out.println(d1);
        //
        // new Date(2022,3,10,15,22,17);
        //em.out.println(d1);
        //
        //new Date(12345);// Timestamp
        //em.out.println(d1);

        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        LocalTime lt1 = LocalTime.now()  ;
        System.out.println(lt1);

        ld1 = LocalDate.of(2015,9,13);
        System.out.println(ld1);

        lt1 = LocalTime.of(23,59,59);
        System.out.println(lt1);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        ld1 = LocalDate.parse("13.12.1985", fmt); // Liesst die Eingabe nach dem Format ein
        ld1 = ld1.plusDays(11);
        System.out.println(ld1);
        System.out.println(ld1.format(fmt));// Passt die Ausgabe an das Format an

        LocalDateTime ldt1 = LocalDateTime.of(ld1,lt1);
        System.out.println(ldt1);

        ldt1 = LocalDateTime.now();
        System.out.println(ldt1);

        LocalDateTime I = LocalDateTime.of(LocalDate.of(2022,11,22),LocalTime.of(11,22)) ;
        System.out.println((I.getDayOfWeek()));
    }

}
