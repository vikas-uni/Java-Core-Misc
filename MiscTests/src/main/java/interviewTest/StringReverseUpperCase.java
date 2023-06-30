package interviewTest;


public class StringReverseUpperCase {
	public static void main(String[] s){
	
	String st="ajay kant parashar";
	  st=st.toLowerCase();
	  String strs="";
	 System.out.println(st);
	  for(int i=(st.length()-1);i>=0;i--){
		  strs=strs+st.charAt(i);
	  }
	  
	  StringBuffer sb=new StringBuffer(strs);
	   for(int i=0;i<sb.length();i++){
		   if(i==0)
			   sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
		   if(sb.charAt(i)==' ')
			   sb.replace(i+1,i+2, sb.substring(i+1,i+2).toUpperCase());
	   }
	  
	   System.out.println(sb);
	   strs=sb.toString();
	   System.out.println(strs);
	 /* 
	  String tot="";
	  
	  for(int i=0;i<strs.length();i++){
		  if(i==0){
			  System.out.print(strs.substring(i, i+1).toUpperCase());
			  tot=tot + strs.substring(i, i+1).toUpperCase();
			i++;  
		  }
	  if(strs.charAt(i)==' '){
		   System.out.print(" "+strs.substring(i+1, i+2).toUpperCase());
		   tot=" "+tot + strs.substring(i+1, i+2).toUpperCase();
		    i++;
	  }
	  else System.out.print(strs.charAt(i));
	  tot=tot + strs.charAt(i);
	  }
	  System.out.println(tot);
	  */
	 
			  
	   }  

}
