package Java8;

import java.util.Optional;

/**
 * It is important to note that the intention of the Optional class is not to
 * replace every single null reference. Instead, its purpose is to help design
 * more-comprehensible APIs so that by just reading the signature of a method,
 * you can tell whether you can expect an optional value. This forces you to
 * fetch the value from Optional and work on it, and at the same time handle the
 * case where optional will be empty. Well, this is exactly the solution of null
 * references/return values which ultimately result into NullPointerException.
 * 
 * @author vikasgond
 *
 */
public class OptionalDemo {

	public static void main(String[] args) {
		Optional<Integer> canBeEmpty1 = Optional.of(5);
		canBeEmpty1.isPresent(); // returns true
		canBeEmpty1.get(); // returns 5

		Optional<Integer> canBeEmpty2 = Optional.empty();
		canBeEmpty2.isPresent();
	}
}
