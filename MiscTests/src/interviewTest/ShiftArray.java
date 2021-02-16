package interviewTest;

public class ShiftArray {

    public static void main(String[] s) {
        int[] i = new int[100];
        for (int j = 0; j < i.length; j++) {
            i[j] = (int) (Math.random() * 100);
        }
        for (int k : i) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int y = 90; y >= 50; y--) {
            i[y] = i[y - 1];
        }
        for (int k : i) {
            System.out.print(k + " ");
        }
    }
}
