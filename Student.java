/**
	File name: Student.java
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
public class Student extends Person {

    private String status;
    
    public Student()
    {
        status = "Junior";
    }

    @Override
    public String toString() {
        return "Student{" + "status=" + status + '}';
    }
    
}
