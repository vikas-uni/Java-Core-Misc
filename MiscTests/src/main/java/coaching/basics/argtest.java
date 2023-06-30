package coaching.basics;

class argTest {

    public static void main(String s[]) {
        int x, i, odd = 0, even = 0;
        for (i = 0; i < s.length; i++) {
            x = Integer.parseInt(s[i]);

            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("no of odd numbers is: " + odd + " and no of even numbers is " + even);
    }
}
