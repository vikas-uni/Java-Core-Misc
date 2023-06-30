package interviewTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindRoom {

	public static void main(String[] args) throws IOException {
		// Enter data using BufferReader
		System.out.println("Enter room:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String name = reader.readLine();
		if (!isValidRoomNo(name)) {
			throw new RuntimeException();
		}

		System.out.println(getRoomNo(name));
	}

	public static int getRoomNo(String input) {

		int roomNum = Integer.parseInt(input);

		int roomCount = 0;
		int counter = 1;
		while (counter <= roomNum) {
			String roomNo = "" + (roomCount+1);

			if (roomNo.contains("2") || roomNo.contains("14")) {
				roomCount++;
				// continue;
			} else {
				roomCount++;
				counter++;
			}
		}

		return roomCount;
	}

	public static boolean isValidRoomNo(String roomNo) {
		long rNum = Long.parseLong(roomNo);
		if (rNum < 1 || rNum > 1300) {
			return false;
		}

		return true;
	}
}
