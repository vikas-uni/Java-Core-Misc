package coaching.basics;

class arrayutil {

    int a[];
    int z;

    arrayutil(int s) {
        a = new int[s];
    }

    void input() {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
    }

    void output() {
        System.out.print("Elements in array are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    int search(int val) {
        z = val;
        int l = 0;
        for (int i = 0; i < a.length; i++) {
            if (z == a[i]) {
                l = a[i];
            } else {
                l = -1;
            }

        }

        return (l);
    }

    void sort() {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
}

class arraytest {

    public static void main(String s[]) {
        arrayutil avl = new arrayutil(10);
        avl.input();
        System.out.println("Array elements are as follows: ");
        avl.output();
        avl.search(32);
        System.out.println("Searching " + avl.z + " in array");
        if (avl.search(32) == -1) {
            System.out.println("no doesnt exists");
        } else {
            System.out.print("no. exists");
        }
        avl.sort();
        System.out.print("Sorted array:");
        avl.output();
    }
}
