package interviewTest;

public class SumNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String numstr = "jdjkjd14nkjd3887744kk";
        int sum = 0;
        for (int i = 0; i < numstr.length(); i++) {
            if (Character.isDigit(numstr.charAt(i))) {
                sum = sum + (int) Integer.parseInt(numstr.substring(i, i + 1));
            }

        }
        System.out.println(sum);
    }
}
