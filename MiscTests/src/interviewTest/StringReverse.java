package interviewTest;

public class StringReverse {

    public static void main(String[] s) {

        String st = "unemployed professionals";
        st = st.toLowerCase();
        String strs = "";
        System.out.println(st);
        for (int i = (st.length() - 1); i >= 0; i--) {
            strs = strs + st.charAt(i);
        }



        for (int i = 0; i < strs.length(); i++) {
            if (i == 0) {
                System.out.print(strs.substring(i, i + 1).toUpperCase());
                i++;
            }
            if (strs.charAt(i) == ' ') {
                System.out.print(" " + strs.substring(i + 1, i + 2).toUpperCase());
                i++;
            } else {
                System.out.print(strs.charAt(i));
            }
        }
        System.out.println();
        StringReverse reverse = new StringReverse();
        System.out.println(reverse.reverse(st));
        


    }
    //using recursion
    public String reverse(String str) {  
        // exit or termination condition  
        if ((null == str) || (str.length( )  <= 1)) {  
            System.out.println(str);
            return str;  
        }  
        System.out.println(str+" , "+str.charAt(0));
          
        // put the first character (i.e. charAt(0)) to the end. String indices are 0 based.   
        // and recurse with 2nd character (i.e. substring(1)) onwards    
        return reverse(str.substring(1)) + str.charAt(0);  
    } 
}
