
public class SplitTest {
	public static void main(String[] args) {
		String input = "Claim|Exposure|Financial|Notes|Document";
		String[] arr = input.split("\\|");
		for (String string : arr) {
			System.out.println(string);
		}
		
		String name = "jean paul sartre";
		System.out.println(name.substring(0, name.indexOf(" ")));
		
		String path = "\\asd\\dfg\\gh\\bn";
		//System.out.println(path.replaceAll(, ));
		
		
	}
}
