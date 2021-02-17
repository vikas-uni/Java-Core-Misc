import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendHTMLEmail
{
	 public static void main(String[] arg){
	        //only smtp port 465 is SSL. 587 is TSL (no SSL) and 25 is plain. 

	        // Create a mail session
	        Properties properties = new Properties();
	        
	        //working config for gmail--------------------------
	        //===== CHANGE THESE FOUR VARIABLE VALUES TO REFLECT YOUR ENVIRONMENT ======
	        /*final String user = "vikas.uni@gmail.com";   // username on mail server
	        final String password = ""; // user password

	        String fromAddress = "vikas.uni@gmail.com"; // newlycreateduser@localhost
	        String toAddress = "vikas.uni@gmail.com";
	        
	        properties.put("mail.smtp.host", "smtp.gmail.com");
	        properties.put("mail.smtp.socketFactory.port", "465");
	        properties.put("mail.smtp.socketFactory.class",
	                "javax.net.ssl.SSLSocketFactory");
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.port", "465");*/
	        //------------------------------------------ 
	        
	        final String user = "vikas.gond@abc.com";   // username on mail server
	        final String password = "9saq@7447"; // user password

	        String fromAddress = "rajeev.nagpal@abc.com"; // newlycreateduser@localhost
	        /*String toAddress = "vikas.gond@abc.com,Sanjeev@abc.com,Nidhi.Kulkarni@abc.com,Muskan.Jaiswal@abc.com," +
	        		"Deepak.Jaiswal@abc.com,Sandip.Mandal@abc.com";*/
	        String toAddress = "Nidhi.Kulkarni@abc.com,vikas.gond@abc.com";
	        
	        
	        properties.put("mail.smtp.host", "SMTP.host.com");
	        properties.put("mail.transport.protocol", "smtp");
	        properties.put("mail.smtp.socketFactory.port", "25");
	       // properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	        properties.put("mail.smtp.socketFactory.fallback", "true"); 
	        //properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.port", "25");
	        
	        
	        Authenticator authenticator = new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(user, password);
	            }
	        };
	        
	        Session session = Session.getDefaultInstance(properties, authenticator);

	        try 
	        {
	        	
	        	/*
	        	 Address[] cc = new Address[] {InternetAddress.parse("abc@abc.com"),
                        InternetAddress.parse("abc@def.com"), 
                        InternetAddress.parse("ghi@abc.com")};
	        		message.addRecipients(Message.RecipientType.CC, cc);
	        		
	        		message.addRecipients(Message.RecipientType.CC, 
                      InternetAddress.parse("abc@abc.com,abc@def.com,ghi@abc.com"));
	        	*/
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(fromAddress));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));

	            message.setSubject("Hi");
	            message.setText("Hello!!!");
	            Transport.send(message);

	            System.out.println("Email sent successfully");
	        }
	        catch (MessagingException e) 
	        {
	            e.printStackTrace();
	        }
	    } 
}