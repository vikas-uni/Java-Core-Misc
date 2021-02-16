package recursion;

import java.io.File;
import java.nio.file.Files;

public class FolderRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * File f = new File("D:/vikas"); //boolean made = f.mkdir();
		 * //System.out.println(made);
		 * 
		 * File[] files = f.listFiles();
		 * 
		 * System.out.println(files[0]);
		 */
		//System.out.println(countFolders("\\\\dev05nas\\ECDShare-DEV\\dev\\medical\\guidewire\\I1"));
		System.out.println(countFolders("C:\\Users\\vikas.gond\\Desktop\\JobsToDeployQapp30lxv\\ForQA"));
		// System.out.println(countChar("fdsgsdfg"));
	}

	public static int countFolders(String path) {

		/*
		 * if(new File(path).listFiles().length == 0){ return 0; }
		 */

		File f = new File(path);
		
		/*if(f.isDirectory() && f.listFiles().length == 0){
			return 0;
		}*/
		
		File[] files = f.listFiles();
		if (files == null) {
			return 0;
		}

		int folders = 1;
		for (File file : files) {
			System.out.println(file.getPath());
			if (file.isDirectory()) {
				System.out.println(file.getPath());
				int tmp = countFolders(file.getPath());
				folders = folders + tmp;

			}
		}

		return folders;
	}

	public static int countChar(String in) {
		if (in.length() < 1) {
			return 0;
		}
		System.out.println("String is:  "+in);
		
		int tmp = countChar(in.substring(1));
		
		System.out.println("tmp is:  "+tmp);

		return 1 + tmp;
	}

}
