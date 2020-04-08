import java.util.Calendar;
import java.text.SimpleDateFormat;
 
public class MyWelcomeDate {
 
    public static void main(String[] args) {
     
        Calendar calender = Calendar.getInstance();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	
        System.out.println("Nice to meet you Tanaka-san! " + sdf.format(calender.getTime()));
    }
 
}
