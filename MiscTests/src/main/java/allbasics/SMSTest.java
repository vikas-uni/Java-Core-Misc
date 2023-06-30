package allbasics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SMSTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String recipient = "+919560063240";
			String message = " Greetings from Mr. Gupta! Have a nice day!";
			String username = "vikas.gond";
			String password = "july@123";
			String originator = "+440987654321";

			String requestUrl = "http://127.0.0.1:9501/api?action=sendmessage&" + "username="
					+ URLEncoder.encode(username, "UTF-8") + "&password=" + URLEncoder.encode(password, "UTF-8")
					+ "&recipient=" + URLEncoder.encode(recipient, "UTF-8") + "&messagetype=SMS:TEXT" + "&messagedata="
					+ URLEncoder.encode(message, "UTF-8") + "&originator=" + URLEncoder.encode(originator, "UTF-8")
					+ "&serviceprovider=GSMModem1" + "&responseformat=html";

			URL url = new URL(requestUrl);
			HttpURLConnection uc = (HttpURLConnection) url.openConnection();

			System.out.println(uc.getResponseMessage());

			uc.disconnect();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

	}

}
