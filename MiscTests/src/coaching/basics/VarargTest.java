package coaching.basics;

class varag {

    int sum = 0;

    int val(int... x) {       //a vararg parameter
        for (int i : x) {
            sum = sum + i;               //eqv to- for(int i=0;i<x.length;i++){
        }                        //              sum=sum+x[i];
        return (sum);
    }
}

class VarargTest {

    public static void main(String s[]) {
        varag v = new varag();
        v.val(32, 76, 45, 12, 2);
        System.out.println("sum is " + v.sum);
    }
}