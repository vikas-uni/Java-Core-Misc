package interviewTest;

public class WhileLoopDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int term = 10, n = 1, k = 1;
        while (n <= term + 1) {
            for (int j = 0; j < k; j++) {

                if (j < (k + 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }



            }

            k = n * 2;
            n++;
            System.out.println();

        }


    }
}
