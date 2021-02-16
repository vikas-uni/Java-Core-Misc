package coaching.basics;

//prog to find a no. in an array and print row no. of match
class twoDfind {

    public static void main(String s[]) {
        int a[][] = new int[5][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Array is: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
        int x = Integer.parseInt(s[0]);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (x == a[i][j]) {
                    System.out.println("The no. is found in row: " + (i + 1));
                    return;
                }//else System.out.println("No. not found");
//return;
            }
        }
    }
}
