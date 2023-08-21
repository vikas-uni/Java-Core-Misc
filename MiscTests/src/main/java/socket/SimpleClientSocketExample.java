package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

// a full web server in socket program- https://jojozhuang.github.io/programming/building-web-server-with-java-socket/

//https://www.infoworld.com/article/2853780/socket-programming-for-scalable-systems.html

public class SimpleClientSocketExample {
	public static void main(String[] args) {
		String server = "www.google.com";
		String path = "/";

		System.out.println("Loading contents of URL: " + server);

		try {
			// Connect to the server
			//Socket socket = new Socket(server, 9081)
			Socket socket = new Socket(server, 80); // if you want to define a different port, you can do so by adding
														// a colon followed by the port number, for example: :8080

			// Create input and output streams to read from and write to the server
			PrintStream out = new PrintStream(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Follow the HTTP protocol of GET <path> HTTP/1.0 followed by an empty line
			out.println("GET " + path + " HTTP/1.0");
			out.println();

			System.out.println(socket.getReceiveBufferSize());
			System.out.println(socket.getKeepAlive());
			System.out.println(socket.getLocalPort());
			System.out.println(socket.getSendBufferSize());
			System.out.println(socket.getChannel());
			System.out.println(socket.getLocalSocketAddress());
			System.out.println(socket.getRemoteSocketAddress());
			System.out.println(socket.getKeepAlive());

			// Read data from the server until we finish reading the document
			System.out.println("-------Server Response--------------");
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			System.out.println("-------Server Response End--------------");
			// Close our streams
			in.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
