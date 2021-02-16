package assignments.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckDigits {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//int in = 0;
		String res = "not okay";
		
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		System.out.println("Please enter 9 digit no.");
		String name=br.readLine(); 
		//in = Integer.parseInt(name);
		if(name.length() < 9){
			System.out.println("wrong no. of digits, please try again");
			return;
		}
		
		for(int i = 0; i < name.length(); i++){
			
			int sum = 0;
			int last = 0;
			
			for (int j = 0; j< name.length(); j++){
				if(i == j){
					continue;
				}
				sum = sum + (name.charAt(j)- '0');
			}
			last = sum;
			while(last >= 0){
				last = last/10;
				if(last < 10)
					break;
			}
			
			if(name.contains(""+last)){
				res = "okay";
				break;
			}
			
		}
		
		System.out.println(res);
	}

}
