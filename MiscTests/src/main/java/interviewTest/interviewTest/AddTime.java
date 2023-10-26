package interviewTest.interviewTest;

public class AddTime {
	
	public static void main(String[] args) {
		System.out.println(addTime(22, 25, 48, 35));
		
		String in = "  02   10  ";
		in = in.trim();
		System.out.println(Character.isDigit(in.charAt(0))+" "+ in.charAt(0));
		System.out.println(Character.isDigit(in.charAt(1))+" "+ in.charAt(1));
		
		
		if(Character.isDigit(in.charAt(0))) {
			
		}
		
		System.out.println((in.charAt(0)+in.charAt(1)));
	}
	

	public static String addTime(int currHrs, int currMins, int hrs, int min) {
		String out = "";
		
		int mm = currMins + min;
		if(mm >= 60) {
			while(mm >= 60) {
			mm = mm - 60;
			hrs++;
			}
		}
		
		int hh = currHrs+hrs;
		if(hh >=24) {
			while(hh >= 24)
			hh =hh -24;
		}
		if(hh < 10) {
			out = out + "0"+hh;
		}else {
			
			out = out + hh;
		}
		
		if(mm < 10) {
			out = out + " 0"+mm;
		}else {
			out = out + " "+mm;
		}
		
		return out;
	}
}
