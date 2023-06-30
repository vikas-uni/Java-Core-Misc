/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author ADMIN
 * Recursive Problem-Solving
• When we use recursion, we solve a problem by reducing it 
to a simpler problem of the same kind.
• We keep doing this until we reach a problem that is 
simple enough to be solved directly.  
• This simplest problem is known as the base case.
public static void printSeries(int n1, int n2) {
if (n1 == n2) {           // base case
System.out.println(n2);
} else {
System.out.print(n1 + ", ");
printSeries(n1 + 1, n2);
}
}
• The base case stops the recursion, because it doesn't
make another call to the method.
Recursive Problem-Solving (cont.)
• If the base case hasn't been reached, we execute the
recursive case.
public static void printSeries(int n1, int n2) {
if (n1 == n2) {           // base case
System.out.println(n2);
} else {                  // recursive case
System.out.print(n1 + ", ");
printSeries(n1 + 1, n2);
}
}
• The recursive case:
• reduces the overall problem to one or more simpler problems
of the same kind
• makes recursive calls to solve the simpler problems
* 
 * Structure of a Recursive Method
recursiveMethod(parameters) {
if (stopping condition) {
// handle the base case
} else {
// recursive case:
// possibly do something here
recursiveMethod(modified parameters);
// possibly do something here
}
}
• There can be multiple base cases and recursive cases.
• When we make the recursive call, we typically use parameters 
that bring us closer to a base case.
 */
public class RecursionTest {
//    int n = 0;

    public static void main(String[] args) {
        RecursionTest r = new RecursionTest();
        r.go(10);
        
        System.out.println(r.recReverse("vikas"));
        r.recReverse2("pulsar 200 ns");
        r.mystery(5);
    }
//    int fact = 1;
    int a = 0, b = 1;
    
    void go(int x) {
        if (x == 0) {
            return;
        }
//        n++;
//        fact *= x;
        System.out.println(a);
        a = a + b;
        b = a - b;
//        System.out.println(x);
        
        
        go(x - 1);
    }

    String recReverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        System.out.println(str);
        return recReverse(str.substring(1)) + str.charAt(0);
        
    }
    String rev = "";

    void recReverse2(String str) {
        if (str.length() == 1) {
            rev = rev + str;
            System.out.println(rev);
            return;
        }        
        rev = rev + str.charAt(str.length() - 1);
        recReverse2(str.substring(0, str.length() - 1));       //method called at the end of the method.This is tail recursion.
        
    }

    public static void mystery(int i) {
        if (i <= 0) {     // base case
            System.out.println("base case reached...returning...");
            return;
        }
// recursive case
        System.out.println("value on stack is "+i);
        mystery(i - 1);
        System.out.println("value on stack afrer return is "+i);       
       
    }
}
