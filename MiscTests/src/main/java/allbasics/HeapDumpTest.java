package allbasics;

import java.util.ArrayList;
import java.util.List;

//https://www.vogella.com/tutorials/EclipseMemoryAnalyzer/article.html

public class HeapDumpTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		while (1 < 2) {
			list.add("OutOfMemoryError soon");
		}

	}
}
