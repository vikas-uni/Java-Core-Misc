import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class DateTest {

	public static void main(String args[])
	{
		try{
		
			String dateStr = "Mon Jun 18 00:00:00 IST 2012";
			DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
			Date date = (Date)formatter.parse(dateStr);
			System.out.println(date.before(new Date()));
			
			
			SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
		    Date now = new Date();
		    String strDate = sdfDate.format(now);
			
		    System.out.println(now.getTime());
		    
		    String fileName = "abc.jpg";
		    String ext = fileName.substring(fileName.lastIndexOf("."));
		    //System.out.println("ext is--"+ext.substring(1));
		    
		    fileName = fileName.replace(ext, "-"+now.getTime()+ext);
			
			System.out.println(strDate);
			System.out.println(fileName);
			
			
//			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//			Calendar cal = Calendar.getInstance();
//			System.out.println(dateFormat.format(cal.getTime()));
//			
//Date currentDate = new SimpleDateFormat("MM-dd-yyyy").parse(new Date().toString());
			
			/*DatatypeFactory df = DatatypeFactory.newInstance();
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTimeInMillis(currentDate.getTime());
			XMLGregorianCalendar xMLGregorianCalendar = df
					.newXMLGregorianCalendar(gc);
			
			System.out.println(currentDate);
		    
		    System.out.println("Öut date######################:::::"+xMLGregorianCalendar.toString());
		    */
		/*    System.out.println("Öut date######################:::::"+new Date());

		    
		DateFormat datef = new SimpleDateFormat("MM-dd-yyyy");
	    String s = datef.format(new Date());
	    Date curdate=datef.parse(s);
		
//		Date curdate = new SimpleDateFormat("MM-DD-YYYY").parse("04-07-2015");
		
	    System.out.println("Öut date######################:::::"+curdate);

	    
	    
		DatatypeFactory df = DatatypeFactory.newInstance();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(curdate.getTime());
		XMLGregorianCalendar xMLGregorianCalendar = df
				.newXMLGregorianCalendar(gc);
	    
	    System.out.println("Öut date######################:::::"+xMLGregorianCalendar.toString());*/

			
			SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			java.util.Date now1 = new java.util.Date();
			String strDate111 = sdfDate1.format(now1);

			String strDate11 = strDate111.replace(" ", "T");
			
			System.out.println("-------------+:"+strDate11);
	    
		}catch(Exception e){
			
		}
	}
}
