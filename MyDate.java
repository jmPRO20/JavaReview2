/**
	File name: MyDate.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/



import java.util.Date;

/**
 *
 * @author Joshua
 */
public class MyDate extends Date {

    private int year;
    private int month;
    private int day;
    private Date date;
    
    public MyDate()
    {      
        date = new Date();
    }
    
    public MyDate(long time)
    {
        date = new Date(time);
    }
    
    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void setDate(long elapsedTime)
    {
        date.setTime(elapsedTime);
    }

    public int getYear() {
        return year;
    }


    public int getMonth() {
        return month;
    }
 

    public int getDay() {
        return day;
    }
   

}
