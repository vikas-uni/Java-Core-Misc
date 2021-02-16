package coaching.IO;

//prog to demo. PipedInput/OutputStreams
import java.io.*;

class PipedTest {

    public static void main(String s[]) throws IOException {
        PipedOutputStream pout = new PipedOutputStream();
        PipedInputStream pin = new PipedInputStream(pout);
        ReaderThread rt = new ReaderThread(s[0], pout);
        WriterThread wt = new WriterThread(s[1], pin);
        rt.start();
        wt.start();
    }
}

class ReaderThread extends Thread {

    PipedOutputStream pout;
    String fname;

    ReaderThread(String fname, PipedOutputStream pout) {
        this.pout = pout;
        this.fname = fname;
    }

    public void run() {
        try {
            FileInputStream fis = new FileInputStream(fname);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            PrintWriter pw = new PrintWriter(pout);
            while (true) {
                String str = br.readLine();
                if (str == null) {
                    break;
                }
                pw.println(str);
                pw.flush();
            }
            br.close();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class WriterThread extends Thread {

    PipedInputStream pin;
    String fname;

    WriterThread(String fname, PipedInputStream pin) {
        this.pin = pin;
        this.fname = fname;
    }

    public void run() {
        try {
            FileOutputStream fos = new FileOutputStream(fname);
            PrintWriter pw = new PrintWriter(fos);
            BufferedReader br = new BufferedReader(new InputStreamReader(pin));
            while (true) {
                String str = br.readLine();
                if (str == null) {
                    break;
                }
                pw.println(str);
                pw.flush();
            }
            br.close();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}