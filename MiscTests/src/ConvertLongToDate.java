import java.text.SimpleDateFormat;
import java.util.Date;


public class ConvertLongToDate {
	 public static void main(String[] args) {
	        long val = 1428085860000L;
	        Long l2 = 34L;
	        double d = l2;
	        Date date=new Date(val);
	        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yy");
	        String dateText = df2.format(date);
	        System.out.println(dateText);
	        
	        System.out.println(d);
	    }
}
