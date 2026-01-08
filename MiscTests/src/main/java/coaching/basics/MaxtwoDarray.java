package coaching.basics;

//program to find max value of a row and column
class MaxtwoDarray {

    public static void main(String s[]) {
        int nor = Integer.parseInt(s[0]);
        int noc = Integer.parseInt(s[1]);
        int a[][] = new int[nor][noc];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("two D array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
        int maxr;
        for (int i = 0; i < a.length; i++) {
            maxr = a[i][0];
            for (int j = 0; j < a[i].length - 1; j++) {
                if (a[i][j + 1] > maxr) {
                    maxr = a[i][j + 1];
                }
            }
            System.out.println("max value in " + (i + 1) + " row= " + maxr);
        }
        int maxc;
        for (int j = 0; j < noc; j++) {
            maxc = a[0][j];
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i + 1][j] > maxc) {
                    maxc = a[i + 1][j];
                }
            }
            System.out.println("max value in " + (j + 1) + " column= " + maxc);
        }
    }
}