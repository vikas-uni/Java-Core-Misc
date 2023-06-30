package coaching.IO;

import java.io.*;

class BufferedInputTest {

    public static void main(String s[]) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");                     //file is first read into FileInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);                   //FileInputStream is then passed to BufferedInputStream
            int count = 0;
            while (true) {
                int i = bis.read();                        //this reads each char in stream and returns int equivalent of that char
                if (i == -1) {
                    break;
                }
                if (i == 32) {
                    bis.mark(count);                 //set the mark at specified index
                }
                count++;

                System.out.print((char) i);           //int value  downcasted to char
            }
            bis.reset();                               //move the pointer to the marked index	
            System.out.println("\n\n last word in second time");
            while (true) {
                int i = bis.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
            bis.close();
        } catch (IOException e) {
        }

    }
}
