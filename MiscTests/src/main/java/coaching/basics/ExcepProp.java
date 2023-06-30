package coaching.basics;

//finally block with exception propagation
class ExceptProp {

    public static void main(String s[]) {
        int z;
        System.out.println("Welcome");
        try {
            z = operation(s[0], s[1]);
            System.out.println("result= " + z);
        } catch (ArithmeticException e) {
            System.out.println("Divisor cannot be zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds");
        } finally {
            System.out.println("finally in main");
        }
        System.out.println("Thanks");
    }

    static int operation(String s1, String s2) {
        int z = 0;
        try {
            int x = Integer.parseInt(s1);
            int y = Integer.parseInt(s2);
            z = x / y;
            return (z);
        } catch (NumberFormatException e) {
            System.out.println("wrong no. format");
            return (0);
        } finally {
            System.out.println("finally in operator");
        }
    }
}
