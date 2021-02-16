package coaching.basics;

class argdiffsum {

    public static void main(String s[]) {
        int x, y, i, diff = 0, sum, n = 0;
        if (s.length % 2 == 0) {

            for (i = 0; i < s.length - 1; i++) {

                x = Integer.parseInt(s[i]);
                y = Integer.parseInt(s[i + 1]);


                diff = x - y;
                sum = n + diff;
                System.out.println("difference is " + x + "-" + y + "=" + diff);

                n = diff;


                System.out.println("Sum is " + sum);
            }

        } else {
            System.out.println("enter even no of values");
        }
    }
}
