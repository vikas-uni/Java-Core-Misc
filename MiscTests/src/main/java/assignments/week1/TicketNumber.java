package assignments.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicketNumber {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String res = "fail";
		
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		System.out.println("Please enter 6 digit no.");
		String num=br.readLine(); 
	
		int n = Integer.parseInt(num.substring(0, num.length() - 1));
	
		int div = n % 7;
		if(div == (num.charAt(num.length()-1) - '0')){
			res = "pass";
		}
		
			System.out.println(res);	
	}

}
