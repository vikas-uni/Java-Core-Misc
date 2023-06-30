package interviewTest.interviewTest;

public class CharMaxOccur {
	public static void main(String[] args) {
		String input = "qqqqqiiiirrbbbbbbbbbxxnnnnnnnnnnnnnnnqqqqqqqqqqqqqqqqwwwwww";
		
		String tmp = new String(input);
		
		char[] arr = tmp.toCharArray();
		int max = 1;
		char maxChar = 0;
		
		for(int i = 0; i < arr.length-1; i++){
			char ch = arr[i];
			if(ch == 0){
				continue;
			}
			int count = 1;
			for(int j = i+1; j < arr.length ; j++){
				if(arr[j] == 0){
					continue;
				}
				if(ch == arr[j]){
					count++;
					arr[j] = 0;
					if(count > max){
						max = count;
						maxChar = ch;
					}
				}
			}
		}
		
		System.out.println(max+"  "+maxChar);
	}

}
