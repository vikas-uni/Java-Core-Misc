import java.util.ArrayList;
import java.util.List;

//find index of alphabetic series of characters eg- a = 1, b= 2 ...aa = 27 , ab = 28.........
public class SeriesIndex {
	static String input = "ajw";
	static List<String> alphabets = new ArrayList<String>();
	
	static{
		System.out.println("in static");
		for(int i='a' ; i < 'a'+26 ; i++){
			String str = ""+(char)i;
			alphabets.add(str);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(alphabets);
		
		int idx = findIndex(input);
		System.out.println(idx);
	}

	
	private static int findIndex(String input){
		int len = input.length();
		int count = len -1;
		
		int index = 0;
		
		for(int k = 0 ; k < len ; k++){
			int idx = alphabets.indexOf(""+input.charAt(k)) + 1;
			index = (((int) Math.pow(26, count)) * idx) + index;			
			count--;
		}
		return index;
		
	}
}
