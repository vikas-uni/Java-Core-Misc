package allbasics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikas-PC demonstrates '%' operator by using +, - and =
 */
public class ModTest {
	public static void main(String[] args) {
		int big = 20, small = 7, temp = 0, mod = 0;
		while (temp <= big) {
			temp += small;
			if (temp > big) {
				temp -= small;
				break;
			}
		}
		mod = big - temp;
		System.out.println(mod);
	}

}
