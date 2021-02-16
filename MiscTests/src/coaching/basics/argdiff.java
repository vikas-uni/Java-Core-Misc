package coaching.basics;

class argdiff {

    public static void main(String s[]) {
        int x = 0, y = 0, i, diff;

        for (i = 0; i < s.length - 1; i++) {

            x = Integer.parseInt(s[i]);
            y = Integer.parseInt(s[i + 1]);
            diff = x - y;
            System.out.println("difference is " + diff);
        }

    }
}
