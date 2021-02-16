package interviewTest;


public class TripleLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {


            for (int j = 1; j <= i; j++) {

                for (int k = 1; k <= j; k++) {

                    System.out.print("k");
                }
                System.out.println("j");
            }
            System.out.println("i");
        }



    }
}
