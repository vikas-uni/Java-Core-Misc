public class CharMaxOccur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String in = "4rrgggggggggggwwwwwrryyyyyyyyyyiiiiyyyygggggggggss";

		char max = ' ';
		int count = 1;

		for (int i = 0; i < in.length(); i++) {
			char tmp = in.charAt(i);
			int tmpCount = 0;

			for (int j = i; j < in.length(); j++) {

				if (tmp == in.charAt(j)) {
					tmpCount++;
				}

			}

			if (tmpCount > count) {
				count = tmpCount;
				max = tmp;
			}

		}

		System.out.println(max + "  " + count);
	}

}
