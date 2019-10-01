/**
	File name: Staff.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/




/**
 *
 * @author Joshua
 */
public class Staff extends Employee {

    private String title;
    
    public Staff()
    {
        super();
        title = "Teacher";
    }

    @Override
    public String toString() {
        return "Staff{" + "title = " + title + '}';
    }
}
