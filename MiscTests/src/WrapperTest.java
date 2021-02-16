
public class WrapperTest {
	
	public static void main(String[] args) {
		Integer r = 2;
		Short s = 5;
		Byte b = 6;
		Float f;
		
		//s = b; //not allowed
		r += b;  //allowed
		
		
		
		
	    System.out.println("-");
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<i;j++)
                System.out.print("-");
            for(int j=0;j<i;j++)
                System.out.print("*");
          
            System.out.println();
        }
        

		
	}

}
