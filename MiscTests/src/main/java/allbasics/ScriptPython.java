package allbasics;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ScriptPython {
	Process mProcess;

	public void runScript() {
		try {
			List<String> cmd = new ArrayList();
			ProcessBuilder builder = new ProcessBuilder("python", "pck_websphere_snaps_compare.py",
					"C:\\Users\\vikasgond\\Desktop\\4d323f15-61eb-33ae-3161-95a77f44e328", "08-09-2021-100251",
					"4d323f15-61eb-33ae-3161-95a77f44e328", "http://vMunCDA01.sbb01.spoc.global:80/CDA/", "18225763");

			/*
			 * ProcessBuilder builder = new ProcessBuilder("python",
			 * "C:\\Users\\vikasgond\\Desktop\\4d323f15-61eb-33ae-3161-95a77f44e328\\testPy.py",
			 * "e", "d", "e");
			 */
			// Process p = pb.start();

			/*
			 * BufferedReader in = new BufferedReader(new
			 * InputStreamReader(p.getInputStream())); int ret = new
			 * Integer(in.readLine()).intValue(); System.out.println("value is : " + ret);
			 * 
			 * int wait = p.waitFor(); System.out.println("wait---"+wait);
			 */

			// ProcessBuilder builder = new ProcessBuilder(cmd);
			builder.redirectErrorStream(true);
			Process p = builder.start();
			final InputStream in = p.getInputStream();
			Runnable run = new Runnable() {
				public void run() {
					byte[] buffer = new byte[1024];
					try {
						int len;
						while ((len = in.read(buffer)) != -1) {
							System.out.write(buffer, 0, len);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			new Thread(run).start();
			p.getOutputStream().close();
			int waitFor = p.waitFor();
			System.out.println("***waitfor**" + waitFor);
			System.exit(waitFor);
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
	}

	public static void main(String[] args) {
		ScriptPython scriptPython = new ScriptPython();
		scriptPython.runScript();
	}
}
