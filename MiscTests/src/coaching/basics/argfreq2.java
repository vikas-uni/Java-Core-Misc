package coaching.basics;

class argfreq2 {

    public static void main(String s[]) {
        int x, y, i, freq = 1;
        y = Integer.parseInt(s[s.length - 1]);
        for (i = 0; i < s.length - 2; i++) {
            x = Integer.parseInt(s[i]);

            if (y == x) {
                freq++;
            }
        }
        System.out.println("freq of " + y + "is " + freq);
    }
}