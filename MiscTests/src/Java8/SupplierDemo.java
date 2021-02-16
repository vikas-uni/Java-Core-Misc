package Java8;

import java.util.LinkedList;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * There are five basic functional interfaces that, by default, operate on a
 * single reference type: Predicate, Unary Operator, Function, Supplier,
 * Consumer and one which operates on two reference types — BinaryOperator
 * 
 * @author vikasgond
 *
 */

public class SupplierDemo {
	public static void main(String args[]) {

		// This function returns a random value.
		Supplier<Double> randomValue = () -> Math.random();

		// Print the random value using get()
		System.out.println(randomValue.get());
		
		Stream<String> names = Stream.of("aBc", "d", "ef");
		Supplier<LinkedList> collectionFactory = new Supplier() {

			@Override
			public LinkedList get() {
				// TODO Auto-generated method stub
				return new LinkedList();
			}
		};
		System.out.println(names.map(s -> s.toUpperCase()).collect(Collectors.toCollection(collectionFactory)));
	}
}
