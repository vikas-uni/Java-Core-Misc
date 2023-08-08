package coaching.NET;

//prog to demo java.net.InetAdress class 
import java.net.*;
import java.util.stream.Stream;

class NetTest {

    public static void main(String s[]) {
        try {
            InetAddress in = InetAddress.getLocalHost();
        	InetAddress[] in2 = InetAddress.getAllByName("www.google.com");
        	Stream.of(in2).forEach(System.out::println);
            System.out.println("name: " + in.getHostName());
            System.out.println("host address: " + in.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}