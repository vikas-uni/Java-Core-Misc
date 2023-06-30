package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	private static List<List<String>> listofLists = new ArrayList<>();

	static {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("D");
		al2.add("E");
		al2.add("F");
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("G");
		al3.add("H");
		al3.add("I");
		listofLists.add(al1);
		listofLists.add(al2);
		listofLists.add(al3);
	}

	{
		System.out.println("--------------------");
	}

	private static String[] arrayOfstr = { "Jeff Bezos", "Bill Gates", "Mark Zuckerberg" };

	public static void main(String[] args) {
		streamNormalDemo();

	}

	private static void streamNormalDemo() {
		List<String> strList = Arrays.asList(arrayOfstr);

		System.out.println(strList);

		Stream<String> stream = strList.stream();

		System.out.println(stream);

		Predicate<? super String> predicate = s -> s.contains("er");
		List<String> ls = stream.filter(predicate).collect(Collectors.toList());

		System.out.println(ls);

		// generates java.lang.IllegalStateException: stream has already been operated
		// upon or closed
		// l = stream.filter(s -> s.contains("ef")).collect(Collectors.toList());

		stream = strList.stream();
		stream.forEach(s -> System.out.println(s));

		// or below code will also work
		// stream.forEach(System.out::print);
		List<String> combined = new ArrayList<>();

		Consumer<List<String>> cons = ll -> combined.addAll(ll);

		Consumer<List<String>> dispList = lst -> lst.forEach(System.out::println);

		Consumer<String> strCons = System.out::println;

		// listofLists.stream().forEach(l -> combined.addAll(l));
		listofLists.stream().forEach(cons.andThen(dispList)); // specifying external consumer

		System.out.println(listofLists);

		// listofLists.stream().forEach(System.out::print);

		System.out.println("combined list:  " + combined);

		combined.forEach(strCons);

		strCons.accept("asdfjasd");
	}

	private static void flatMapDemo() {
		Function<List<String>, Stream<String>> function = x -> x.stream();
		Stream<List<String>> listOfListStream = listofLists.stream();
		List<String> listOfAllIntegers = listOfListStream.flatMap(function).collect(Collectors.toList());

		System.out.println(listOfAllIntegers);

	}

}
