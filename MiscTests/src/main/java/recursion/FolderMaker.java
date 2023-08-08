/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.io.File;

/**
 *
 * @author ADMIN
 */
public class FolderMaker {

    public static void main(String[] args) {
        FolderMaker fm = new FolderMaker();
        fm.makeFolder();
    }
    String path = "Worm";
    String sub = "";
    int n = 0;

    public void makeFolder() {
        sub = sub + path + "/";
        File file = new File("D:/tmp/"+sub);
        file.mkdir();
        n++;
        if (n == 4) {
            return;
        }
        System.out.println(sub);
        makeFolder();

    }
}
