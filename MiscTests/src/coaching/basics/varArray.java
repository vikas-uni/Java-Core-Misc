package coaching.basics;

//prog to create array of varied elements
class varArray {

    public static void main(String s[]) {
        int a[][] = new int[5][];        //2D array is created holding 5 ref variables
        for (int i = 0; i < a.length; i++) //alotting  different size frm cmd to each array which contains value 
        {
            a[i] = new int[Integer.parseInt(s[i])];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);

                System.out.print("a" + i + j + " is: " + a[i][j] + " ");

            }
            System.out.println();
        }

    }
}
