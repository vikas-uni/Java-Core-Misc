package coaching.basics;

class twoDarray {

    public static void main(String s[]) {
        int a[][];
        int nor = Integer.parseInt(s[0]);
        int noc = Integer.parseInt(s[1]);
        a = new int[nor][noc];
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
        int ecount, ocount;
        for (int i = 0; i < a.length; i++) {
            ecount = ocount = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 2) {
                    ecount++;
                } else {
                    ocount++;
                }
            }
            System.out.println("No.of even values in " + (i + 1) + " row= " + ecount);
            System.out.println("No.of odd values in " + (i + 1) + " row= " + ocount);
        }
    }
}