package interviewTest.interviewTest;

/*prints pattern like-
1
1 2 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
*/
public class DifficultForLoop {

    public static void main(String[] s) {

        int temp = 1;
        for (int i = 0; i < 7; i++) {
            int k = 1;
            //System.out.print(" ");
            for (int j = 1; j <= temp; j++) {
            	
                if (j <= (temp / 2)) {
                    // System.out.print("in prev"+temp/2);
                    System.out.print(" " + k++);
                } else {
                    System.out.print(" " + k--);
                }
            }
            temp += 4;
            System.out.println();
        }

    }
}
