package coaching.basics;

//program to merge two arrays
class arrayop {

    int[] merge(int a[], int b[]) {
        int l[] = a;
        int m[] = b;
        int x[] = new int[l.length + m.length];
        for (int i = 0; i < x.length - m.length; i++) {
            x[i + m.length] = l[i];


            for (int j = i; j < m.length; j++) {
                x[j] = m[j];
            }
        }

        return x;
    }
}

class arraymerge {

    public static void main(String s[]) {
        int a[] = {17, 3, 5, 8, 4, 1, 9, 6};
        int b[] = {12, 4, 13, 21, 3, 5, 7, 12, 34};
        int[] c;
        arrayop aop = new arrayop();
        c = aop.merge(a, b);
        System.out.println("merged array is");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
