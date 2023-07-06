package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//more examples- https://stackabuse.com/java-8-streams-definitive-guide-to-flatmap/

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("my", "bike", "is", "triumph");
		
		Function<String, IntStream> mapper = s -> s.chars();
		//List<IntStream> chars = input.stream().map(mapper).collect(Collectors.toList());
		
		Function<IntStream, Stream<Character>> mapper2 = i -> i.mapToObj(v -> (char)v);
		//Stream<Stream<Character>> obj = chars.stream().map(mapper2);
		
		//obj.forEach(s -> System.out.println(s.collect(Collectors.toList())));
		
		List<Character> collect = input.stream().map(mapper).flatMap(mapper2).collect(Collectors.toList());
		System.out.println(collect);
		
		
		//----------------------
		
		List<List<String>> listofLists = new ArrayList<>();
		List<String> l1 = Arrays.asList("delhi","is","good");
		List<String> l2 = Arrays.asList("I'm","java","developer");
		List<String> l3 = Arrays.asList("season","is","hot");
		
		listofLists.add(l1);
		listofLists.add(l2);
		listofLists.add(l3);
		
		System.out.println(listofLists);
		
		Function<List<String>, Stream<String>> mapper3 = l -> l.stream();
		List<String> finalList = listofLists.stream().peek(System.out::println).flatMap(mapper3).collect(Collectors.toList());
		
		System.out.println(finalList);
		
		List<String> repeat = l1.stream().flatMap(s -> Stream.of(s,s,s)).collect(Collectors.toList());
		System.out.println(repeat);
	}
}
