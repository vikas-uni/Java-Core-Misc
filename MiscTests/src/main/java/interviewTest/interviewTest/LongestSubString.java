package interviewTest.interviewTest;

public class LongestSubString {

	public static void main(String[] args) {
		String input = "qwertqyuopicqz";

		String longest = "";
		int length = input.length();
		int idx = 0;

		int maxlen = 1;
		while (idx < length  ) {

			int frame = 2;
			int compLen = 1;

			for (int i = idx; i < length && idx+frame <= length; i++,frame++) {
				
				//get substring upto a particular frame length
				String subStr = input.substring(idx, idx+frame);
				boolean hasDuplicate = false;

				//---code for comparison among string---
				for (int j = 0; j < subStr.length(); j++) {

					char compChar = subStr.charAt(j);

					for (int k = 0; k < subStr.length(); k++) {

						if (k == j)
							continue;

						if (compChar == subStr.charAt(k)) {
							hasDuplicate = true;
							//frame = j+2;
							break;
						}
					}
					if (hasDuplicate) {
						//idx++;
						break;
					}

				}
				//---comparison code ends---
				
				if (!hasDuplicate) {
					compLen = subStr.length();
					if (maxlen < compLen) {
						maxlen = compLen;
						longest = subStr;
					}
				}
				else
					break;
				
			}

			idx++;
		}

		System.out.println(maxlen + ": " + longest);

	}

}
