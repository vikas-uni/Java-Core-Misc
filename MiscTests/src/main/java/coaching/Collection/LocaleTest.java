package coaching.Collection;

//prog to demo locales

import java.util.*;

class LocaleTest {

    public static void main(String s[]) {

        Locale[] l = Locale.getAvailableLocales();                     //this returns the Locale array that contains the locales represented in OS
        for (Locale lc : l) {
            System.out.print(lc.getLanguage());
            System.out.print(" " + lc.getCountry());
            System.out.print(" " + lc.getDisplayLanguage());
            System.out.println(" " + lc.getDisplayCountry());
        }
    }
}