package coaching.basics;

//program to illustrate exception handling

class ExceptionTest {

    public static void main(String s[]) {
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        try //this block is declared if there is chance for an exception to arise
        {
            int z = x / y;
            System.out.println("Result is " + z);
        } catch (ArithmeticException e) {                   //this block is declared to handle the type of exception that may arise
            System.out.println("cannot divide by zero");    //in case if divisor is zero
            e.printStackTrace();                            //this method prints the origin of exception
            System.out.println("Thank you");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format,enter digits only");     //two or more catch blocks can be declared with one try block   
            e.printStackTrace();
        }
    }
}
