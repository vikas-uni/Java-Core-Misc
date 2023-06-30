package interviewTest.interviewTest;

import javax.swing.SortingFocusTraversalPolicy;

public class NextGreatest {

	public static void main(String[] args) {
		//nextLarge();
		//otherMethod();
		System.out.println(sortInt(783615429));
		
		//removeMatching(731429, 7);
		//sortInt(731429);
	}

	private static void nextLarge() {
		String num = "2163427";
		char[] chars = num.toCharArray();

		int n = Integer.parseInt(num);

		int lastIndex = num.length() - 1;

		String newNum = null;

		for (int i = lastIndex; i >= 0; i--) {
			char temp = chars[lastIndex];
			chars[lastIndex] = chars[lastIndex - 1];
			chars[lastIndex - 1] = temp;

			newNum = new String(chars);

			if (Integer.parseInt(newNum) > n) {
				char[] sorted = sort(chars, i, num.length() - 1);
				newNum = new String(sorted);
				break;
			}
			temp = chars[lastIndex - 1];

			chars[lastIndex - 1] = chars[lastIndex];
			chars[lastIndex] = temp;

			lastIndex--;
		}
		System.out.println(newNum);
	}

	private static char[] sort(char[] in, int start, int end) {
		for (int i = start; i <= end - 1; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (in[i] > in[j]) {
					char tmp = in[j];
					in[j] = in[i];
					in[i] = tmp;
				}
			}
		}		
		return in;
	}
	
	private static void otherMethod() {
		int num = 2163421;
		int copy = num;
		
		int tmp = copy%10;
		copy = copy/10;
		
		int last = copy;
		
		int mul = 1;
		
		int next = tmp;
		
		while(tmp < copy%10){
			
			tmp = copy%10;
			copy = copy/10;
			
			mul = mul*10;
			
			next = tmp*mul + next;
			
		}
		
		last = (((copy/10) * 10) + tmp)*10 + (copy%10) ;
		
		System.out.println(last);
		System.out.println(copy);
		System.out.println(next);
	}
	
	
	private static int sortInt(int num){
		if(num == 0){
			return 0;
		}
		int input = num;
		
		int tmp = input%10;
				
		int units = 1;
		
		int next = tmp;
		
		while(input > 0){
			//tmp = input%10;
			if(input > 0 && input < 10){
				next = input;//%10;
			}
			else;
			next = input%10;
			
			if(tmp > next){
				tmp = next;
			}
			input = input/10;
			units = units*10;
		}
			
		System.out.println(tmp*units/10);
	
		num = removeMatching(num, tmp);
		
		return tmp*units/10 + sortInt(num);
	}

	private static int removeMatching(int num, int match) {
		
		int suffix = 0;
		int newNum = num;
		int units2 = 1;
		int next = 0;
		while(newNum > 0){
			
			if(newNum > 0 && newNum < 10){
				next = newNum;//%10;
			}
			else;
			next = newNum%10;
					
			if(match==next){
				
				newNum = ((units2) * (newNum/10)) + suffix;
				break;
			}
			if(units2 > 1)
				suffix = suffix + next*units2;
			else
				suffix = next;
			
			newNum = newNum/10;
			units2 = units2*10;
		}
		
		return newNum;
	}

}
