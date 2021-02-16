package coaching.basics;

//prog to demo exception handling finally block
class ExcepFinally {

    public static void main(String s[]) {
        int x, y;
        System.out.println("Welcome");
        try {
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
            int z = x / y;
            System.out.println("Result is: " + z);
        } catch (ArithmeticException e) {
            System.out.println("divisor cannot be zero");
        } finally {
            System.out.println("finally in main");
        }
        System.out.println("thank you");
    }
}
