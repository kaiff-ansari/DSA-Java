package CollectionFramework.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormaterDateTime {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // this is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;


        String mydate = dt.format(df2); // creating string using date and format
        System.out.println(mydate);
    }
}
