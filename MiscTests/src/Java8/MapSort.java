package Java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapSort {
	public static void main(String[] args) {
		Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("USA", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);

		Map<String, Integer> wordCounts2 = new HashMap<>();
		wordCounts2.put("USA", 130);
		wordCounts2.put("security", 20);
		wordCounts2.put("industry", 5);
		wordCounts2.put("tech", 70);
		wordCounts2.put("apps", 200);

		Map<String, Integer> merging = new HashMap<>(wordCounts);

		wordCounts2.forEach((k, v) -> wordCounts.merge(k, v, Integer::sum));

		System.out.println(wordCounts);
		Function<? super Entry<String, Integer>, ? extends String> keyMapper = e -> e.getKey();//Map.Entry::getKey;
		Function<? super Entry<String, Integer>, ? extends Integer> valueMapper = e-> e.getValue();//Map.Entry::getValue;
		BinaryOperator<Integer> mergeFunction = (e1, e2) -> e1;
		Comparator<Entry<String, Integer>> comparingByValue = (c1, c2) -> c1.getValue().compareTo(c2.getValue());//Map.Entry.comparingByValue();
		Map<String, Integer> sortedByCount = wordCounts.entrySet().stream().sorted(comparingByValue)
				.collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, LinkedHashMap::new));
		
		System.out.println(sortedByCount);
	}

}
