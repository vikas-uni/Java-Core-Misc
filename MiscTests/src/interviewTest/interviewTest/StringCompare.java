package interviewTest.interviewTest;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		System.out.println(isSame(str1, str2));
		
	}
	
	private static boolean isSame(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			char chS1 = s1.charAt(i);
			char chS2 = s2.charAt(i);
			
			if(!s1.contains(""+chS2) || !s2.contains(""+chS1)){
				return false;
			}
		}
		
		return true;
	}
}
