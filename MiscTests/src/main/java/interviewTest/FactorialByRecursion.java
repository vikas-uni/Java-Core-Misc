package interviewTest;

public class FactorialByRecursion {

    static int sum;

    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            sum = n * fact(n - 1);
            return sum;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(fact(15));

    }
}
