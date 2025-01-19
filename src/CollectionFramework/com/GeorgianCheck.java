package CollectionFramework.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GeorgianCheck {

    public static void main(String[] args) {

//        Calendar c =  Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.MINUTE));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
//
//        GregorianCalendar cal = new GregorianCalendar();
//
//
//        System.out.println(cal.isLeapYear(2024));
//        System.out.println(TimeZone.getAvailableIDs()[1]);
//        System.out.println(TimeZone.getAvailableIDs()[2]);
//        System.out.println(TimeZone.getAvailableIDs()[3]);

        // java API Time
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
