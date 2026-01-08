package interviewTest;

public class FibonacciByRecursion {

    static int fib = 1, tmp = 0;

    static void fibonacci(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(tmp + " ");
        tmp = fib + tmp;
        fib = tmp - fib;
        fibonacci(n - 1);

    }

    public static void main(String[] args) {

        fibonacci(9);

    }
}
