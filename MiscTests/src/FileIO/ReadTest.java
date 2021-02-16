/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

/**
 *
 * @author ADMIN
 */
import java.io.*;

class ReadTest {

    public static void main(String args[]) {
        try {
//            FileInputStream fin = new FileInputStream("criteria.txt");
//            BufferedInputStream bis = new BufferedInputStream(fin);

            // Now read the buffered stream.
            int row = 0, col = 0;

//   while (bis.available() > 0) 
//   {
//       char c = (char)bis.available();
//   System.out.print(c);
//   if(c != ' ' && c != '\n'){
//       row++;
//   }
//  
//   }//
            File testFile = new File("src/FileIO/test/criteria.txt");
            FileReader fr = new FileReader(testFile);
            BufferedReader br = new BufferedReader(fr);

            String s = null;
            String[] tokens = null;//args[0].split(args[1]);

            //br.reset();
            while ((s = br.readLine()) != null) {             // read data
                if (tokens == null) {
                    tokens = s.split(" ");
                    col = tokens.length;
                }
                System.out.println(s);
                row++;
            }

            System.out.println(row + " " + col);
//       System.out.println(tokens.length);
//       for (String string : tokens) {
//           System.out.println(string);
            String s2;
            int count = 0;
            String[][] data = new String[row][col];

            //File testFile2 = new File("test/criteria.txt");
            FileReader fr2 = new FileReader(testFile);
            BufferedReader br2 = new BufferedReader(fr2);
            while ((s2 = br2.readLine()) != null) {
                data[count] = s2.split(" ");
                count++;
                System.out.println(s2);
            }
            
            System.out.println("line break");
            
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(data[i][j]+" ");
                }
                System.out.println("");
            }
            
        } catch (Exception e) {
            System.err.println("Error reading file: " + e);
        }
    }
}