package interviewTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MovieSeats {

	public static void main(String[] args) throws IOException {
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String input = reader.readLine();
		String[] split = input.split(" ");

		List<String> in = new ArrayList<>();

		for (int i = 0; i < split.length; i++) {
			if (!split[i].isEmpty()) {
				in.add(split[i]);
			}
		}
		
		if(in.size() != 3) {
			throw new RuntimeException();
		}

		long seats = Long.parseLong(in.get(0));
		long occupied = Long.parseLong(in.get(1));
		long pref = Long.parseLong(in.get(2));

		Set<Long> occ = new HashSet();

		if (occupied != 0) {
			for (int i = 0; i < occupied; i++) {
				String readLine = reader.readLine();
				long parseInt = 0;
				if (readLine != null && !readLine.isEmpty()) {
					parseInt = Long.parseLong(readLine);
				}
				occ.add(parseInt);
			}
		}

		Set<Long> prefered = new LinkedHashSet();

		if (pref != 0) {
			for (int i = 0; i < pref; i++) {
				String readLine = reader.readLine();
				long parseInt = 0;
				if (readLine != null && !readLine.isEmpty()) {
					parseInt = Long.parseLong(readLine);
				}
				prefered.add(parseInt);
			}
		}

		if (occupied > seats || pref > seats || seats < 1 || seats > 1000000000 || occupied < 0 || occupied > 1000000
				|| pref < 0 || pref > 1000000 || occ.size() != occupied || prefered.size() != pref) {
			throw new RuntimeException();
		}

		if (occupied == 0 && pref == 0) {
			System.out.println("N");
		}

		printSeats(occ, prefered);

	}

	private static void printSeats(Set<Long> occ, Set<Long> pref) {

		for (Long integer : pref) {
			if (occ.contains(integer))
				System.out.println("N");
			else
				System.out.println("Y");
		}

	}
}
