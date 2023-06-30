package concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinSum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int inputs = Integer.parseInt(br.readLine());

			if (inputs < 1 || inputs > 10) {
				throw new Exception();
			}

			while (inputs > 0) {
				int numOfGift = Integer.parseInt(br.readLine());
				int totalGifts = Integer.parseInt(br.readLine());
				String prices = br.readLine();
				Function<? super String, ? extends Long> mapper = i -> {
					long ret = Long.parseLong(i);
					if (ret < 0 || ret > 10000000) {
						throw new RuntimeException();
					}
					return ret;
				};
				List<Long> convertedprices = Stream.of(prices.split(" ")).map(String::trim).map(mapper).sorted()
						.collect(Collectors.toList());

				if (1 > totalGifts || totalGifts > 100000 || numOfGift > totalGifts || numOfGift < 1
						|| convertedprices.size() != totalGifts) {
					throw new Exception();
				}

				long sum = convertedprices.stream().limit(numOfGift).mapToLong(Long::longValue).sum();

				System.out.println(sum);

				inputs--;
			}

		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}

}
