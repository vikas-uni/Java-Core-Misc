package interviewTest.interviewTest;

public class FactorialByRecursion {

    static int sum;

    static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println("value at stack is:"+"sum- "+sum+"   n- "+n);
            sum = n * fact(n - 1);
            System.out.println("value after stack return is:"+"sum- "+sum+"   n- "+n);
            return sum;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(fact(15));

    }
}
