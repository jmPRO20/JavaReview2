/**
	File name: Faculty.java
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
public class Faculty extends Employee {

    private int officeHours;
    private String rank;
    
    public Faculty()
    {
        officeHours = 7;
        rank = "A";
    }

    @Override
    public String toString() {
        return "Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }
}
