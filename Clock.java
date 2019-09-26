import java.util.Calendar;  
import java.util.Date;
import java.text.SimpleDateFormat;


public class Clock {

	public String city;
	public int dateDifference;
	public Date standardTime;
	
	public 	Clock()
	{
		this.city = "Beijing";
		this.dateDifference = 0;
	}
	
	public Date getTime()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(this.standardTime);
		c.add(Calendar.HOUR, dateDifference);
		Date cityDate = c.getTime();
		return cityDate;
	}
	
	public void setTime(int year, int month, int day, int hour, int minute, int second)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, minute);
		cal.set(Calendar.SECOND, second);
		standardTime = cal.getTime();
	}
	
	public void print()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(this.city + " " + sdf.format(this.getTime()));
	}
	
	

}
