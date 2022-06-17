package interviewTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeDateFormat {

	private static String dateFormat1 = "YYYY-MM-DD";
	private static String dateFormat2 = "YYYY/MM/DD";

	public static List<String> changeDateFormat(List<String> dates) {
		List<String> newDate = new ArrayList<String>();

		for (String oldDate : dates) {
			if (oldDate.contains("/")) {
				if (isValiDate(dateFormat2, oldDate)) {
					String changed = changed(oldDate);
					newDate.add(changed);
				}
			}else if (oldDate.contains("-")) {
				if (isValiDate(dateFormat1, oldDate)) {
					String changed = changed(oldDate);
					newDate.add(changed);
				}
			}

		}

		return newDate;
	}

	public static void Main(String[] args) {
		List<String> dates = changeDateFormat(Arrays.asList("2010/03/30", "15/12/2016", "11-15-2012", "20130720"));
		for (String date : dates) {
			System.out.println(date);
		}
	}

	private static boolean isValiDate(String dateFormat, String date) {
		DateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(false);
		try {
			sdf.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	private static String changed(String date) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < date.length(); i++) {
			if (Character.isDigit(date.charAt(i))) {
				stringBuilder.append(date.charAt(i));
			}
		}
		return stringBuilder.toString();
	}
}
