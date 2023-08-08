package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighest {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(3,7,9,18,10);
		
		Comparator<Integer> revsort =  (a,b) -> b-a;
		
		Integer secondHighest = ints.stream().sorted(revsort).skip(1).findFirst().get();
		
		System.out.println(secondHighest);
	}
}
