package interviewTest;

public class Test {

    public static void main(String[] s) {

        int temp = 1;
        for (int i = 0; i < 15; i++) {
            int k = 1;

            for (int j = 1; j <= temp; j++) {
                if (j <= (temp / 2)) {
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
