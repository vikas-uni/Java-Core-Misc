package coaching.Collection;

//program to demo Date format in Locales
import java.text.*;
import java.util.*;

class DateFormatTest {

    public static void main(String s[]) {
        try {
            Locale l = new Locale("en", "us");
            DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, l);
            DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT, l);
            Date d = new Date();
            System.out.println("formated date: " + df1.format(d));
            System.out.println("formated time: " + df2.format(d));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}