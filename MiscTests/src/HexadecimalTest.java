
public class HexadecimalTest {
	 private static final int sizeOfIntInHalfBytes = 8;
	  private static final int numberOfBitsInAHalfByte = 4;
	  private static final int halfByte = 0x0F;
	  private static final char[] hexDigits = { 
	    '0', '1', '2', '3', '4', '5', '6', '7', 
	    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
	  };
	
	public static void main(String[] args) {
		
		//System.out.println(decToHex(6));
		//System.out.println(halfByte);
		long digit = 121726354726L;
		String hexFormatted = String.format("%08X",digit );  //this is most simple way
		//System.out.println(long2Hex(68789));
		System.out.println(hexFormatted);
		System.out.println(12 & 12);
		
	}

	public static String decToHex(int dec) {
	    StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
	    hexBuilder.setLength(sizeOfIntInHalfBytes);
	    for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i)
	    {
	      int j = dec & halfByte;
	      hexBuilder.setCharAt(i, hexDigits[j]);
	      dec >>= numberOfBitsInAHalfByte;
	    }
	    return hexBuilder.toString(); 
	  }
	
	//another solution
	 // precondition:  d is a nonnegative integer
    public static String long2Hex(long d) {
    	int bytes = 8;
    	
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        
        
        
        //while (d > 0) {
        while (bytes > 0 || d>0) {
            int digit = (int) (d % 16);                // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            d = d / 16;
            
            bytes--;
        }
        
        return hex;
    }

}
