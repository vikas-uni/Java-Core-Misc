package coaching.basics;

class argfreq {

    public static void main(String s[]) {
        int x, i, y, freq = 1;
        x = Integer.parseInt(s[0]);  //this method converts string represented numeric in numeric
        for (i = 1; i < s.length; i++) {
            y = Integer.parseInt(s[i]);  //this stores converted numerals in variable y
            if (x == y) {
                freq++;
            }
        }
        System.out.println("freq. of " + x + ":" + freq);
    }
}
