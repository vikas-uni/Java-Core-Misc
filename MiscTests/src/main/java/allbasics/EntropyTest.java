package allbasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EntropyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntropyTest entropyTest = new EntropyTest();
		// System.out.println(entropyTest.randomGen());
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 1; i <= 10000; i++) {
			int num = entropyTest.randomGen();
			int val = m.get(num) == null ? 1 : m.get(num) + 1;
			m.put(num, val);
		}

		System.out.println(m);

		// System.out.println(entropyTest.maxOccurElem(list));

	}

	int randomGen() {
		int sum = 0;
		Random random = new Random();
		for (int i = 0; i <= 2; i++) {
			sum += (random.nextInt(6) + 1);
		}

		return sum;

	}

}
