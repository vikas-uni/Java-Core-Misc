package coaching.basics;

//prog to accept two strings frm cmd and check 2nd is part of 1st
class stpart {

    public static void main(String s[]) {
        String n1 = s[0];
        String n2 = s[1];
        String z = null;
        boolean b = false;
        int i = 0, j = 0;
        i = n1.length();
        j = n2.length();
        for (int k = 0; k < i; k++) {
            for (int l = k; l <= j; l++) {
                z = n1.substring(k, l);
                System.out.println(n2 + " " + z);

                if (n2 == n1.substring(k, l)) {
                    b = true;

                    return;
                }

            }

        }
        if (b) {
            System.out.println("a part");
        } else {
            System.out.println("not a part");
        }
    }
}