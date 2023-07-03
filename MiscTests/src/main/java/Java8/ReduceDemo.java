package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class ReduceDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers
		  .stream()
		  .reduce(0, (subtotal, element) -> subtotal + element);
		ToIntFunction<Integer> mapping = (a) -> a*a;
		
		int result2 = numbers
				  .stream()
				  .mapToInt(mapping).reduce(0, Integer::sum);
		
		System.out.println(result2);
	}
}
