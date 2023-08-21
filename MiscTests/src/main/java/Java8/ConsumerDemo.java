package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String args[]) {
		//simpleImpl();
		andThenImpl();
	}

	private static void andThenImpl() {
		// Consumer to display a number
		// Consumer<Integer> display = a -> System.out.println(a);
		Consumer<Integer> display = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};

		// Implement display using accept()
		display.accept(10);

		/*Consumer<Integer> mulInt = a -> {
			a = a * 2;
			System.out.println(a);
		};*/
		
		Consumer<Integer> mulInt = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				t = t * 2;
				System.out.println(t);
			}
		};
			
	

		Consumer<Integer> addInt = a -> {
			a = a + 2;
			System.out.println(a);
		};

		Consumer<Integer> cons = display.andThen(mulInt);
		
		cons.accept(200);
	}

	private static void simpleImpl() {
		// Consumer to display a number
		Consumer<Integer> display = a -> System.out.println(a);

		// Implement display using accept()
		display.accept(10);

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = list -> {
			for (int i = 0; i < list.size(); i++)
				list.set(i, 2 * list.get(i));
		};

		// Consumer to display a list of numbers
		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		// Implement modify using accept()
		modify.accept(list);

		// Implement dispList using accept()
		dispList.accept(list);
	}

}
