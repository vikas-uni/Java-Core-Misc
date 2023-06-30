package coaching.NET;

//prog to demo java.net.InetAdress class 
import java.net.*;

class NetTest {

    public static void main(String s[]) {
        try {
            InetAddress in = InetAddress.getLocalHost();
            System.out.println("name: " + in.getHostName());
            System.out.println("host address: " + in.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}