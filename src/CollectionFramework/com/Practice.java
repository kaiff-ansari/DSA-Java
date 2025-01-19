package CollectionFramework.com;

import access.com.A;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
//        ArrayList<String> li = new ArrayList<>();
//        li.add("kaif");
//        li.add("altaf");
//        li.add("aakash");
//
//      for(Object a : li){
//          System.out.println(a);
//      }

//
//        Date d = new Date();
//        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

       LocalDateTime dt = LocalDateTime.now();


        DateTimeFormatter f = DateTimeFormatter.ofPattern("H:m:s");
        String p = dt.format(f);
        System.out.println(p);

    }
}
