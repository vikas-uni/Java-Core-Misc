package Java8;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String args[]) {

		// Function which takes in a number(Integer)
		// and returns half of it(Double)
		Function<Integer, Double> half = a -> a / 2.0;

		// apply the function to get the result
		System.out.println(half.apply(10));

		half = half.andThen(a -> 3 * a);

		// apply the function to get the result
		System.out.println(half.apply(10));
	}
}
