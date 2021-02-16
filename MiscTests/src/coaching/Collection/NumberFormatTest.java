package coaching.Collection;

//prog to demo locales
import java.text.*;
import java.util.*;

class NumberFormatTest {

    public static void main(String s[]) {
        try {
            Locale l = new Locale(s[0], s[1]);
            NumberFormat nf1 = NumberFormat.getNumberInstance(l);         //returns the NumberFormat instance of number representation in specified locales
            NumberFormat nf2 = NumberFormat.getCurrencyInstance(l);       //returns NumberFormat instance of currency representation in specified locales
            System.out.println("formated number: " + nf1.format(100000));
            System.out.println("formated currency: " + nf2.format(100000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
