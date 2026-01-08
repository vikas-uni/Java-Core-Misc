package recursion;
public class TestRecursion {

    public static void main(String []args) throws InterruptedException {
        new TestRecursion().reduceByOne(10);
    }

    public void reduceByOne(int n) throws InterruptedException {
        System.out.println("Before "+n);
        //Thread.sleep(2000);
        if(n >= 0) {
            reduceByOne(n-1);
            System.out.println("Inside "+n);
            //Thread.sleep(2000);
        }
        System.out.println("After "+n);
    }
}