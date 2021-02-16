package coaching.basics;

//prog to compare part of strings entered from cmd
class StTest {

    public static void main(String s[]) {
        String st1 = s[0];
        String st2 = s[1];
        boolean b = false;
        for (int i = 0; i < st1.length(); i++) {
            for (int j = i; j <= st2.length(); j++) {
                if (st2.equals(st1.substring(i, j))) {
                    b = true;
                    System.out.println("is a part");
                    return;
                }
            }
        }
        if (!b) {
            System.out.println("not a part");
        }
    }
}
