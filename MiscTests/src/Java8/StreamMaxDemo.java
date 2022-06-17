package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMaxDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(23, 45, 78, 3, 12, 34);
		Stream<Integer> s = intList.stream();

		Optional<Integer> max = s.max((a, b) -> a.compareTo(b));

		System.out.println(max.get());

		// or

		OptionalInt ints = intList.stream().mapToInt(a -> a + 1).max();
		System.out.println(ints.getAsInt());

		// min through reduce
		Optional<Integer> min = intList.stream().reduce((a, b) -> a < b ? a : b);
		System.out.println(min.get());

		// min through comparator
		Function<Integer, Integer> keyExtractor = a -> a;
		Comparator<Integer> comparing = Comparator.comparing(keyExtractor);
		Comparator<Integer> comp2 = (a,b) -> a-b;
		Optional<Integer> min2 = intList.stream().min(comparing);
		System.out.println("keyExtractor " + min2.get());
	}

}
