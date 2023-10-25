package coaching.NET.clientServerComm;

//prog to implement client server communication

import java.io.*;
import java.net.*;

class Client {
	public static void main(String s[]) {
		try {
			System.out.println("client started");
			Socket st = new Socket("localhost", 1050); // socket created wit hostname and server port no.
			System.out.println("connection established");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // take onput from console
			DataInputStream din = new DataInputStream(st.getInputStream()); // take input stream from socket and put it
																			// on DataInputStream
			DataOutputStream dout = new DataOutputStream(st.getOutputStream()); // return output stream to socket
			while (true) {
				System.out.println("enter msg,press only enter to stop");
				String str = br.readLine();
				if (str.length() == 0)
					break;
				dout.writeUTF(str); // put str to output stream
				dout.flush(); // send stream to DataOutputStream
				String response = din.readUTF(); // read data from DataInputStream
				System.out.println("server: " + response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
