package interviewTest.interviewTest;

public class ForLoopPattern {
	
	//printd patter like-
	/*
	%
	%-
	%%--
	%%%---
	%%%%----
	%%%%%-----
*/

    public static void main(String[] s) {
        int k = 1;
        for (int i = 1; i <= 12; i = i + 2) {
            if (i == 1) {
                System.out.print("%");
            } else {
                for (int j = 1; j < i; j++) {
                    if (j <= k / 2) {
                        System.out.print("%");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            k += 2;
            System.out.println();

        }

        //another logic
        
       /* int n = 2;

        for (int i = 1; i <= 10; i++) {
            if (i == 1 || i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    if (j <= n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println();
            n++;
        }*/

    }
}