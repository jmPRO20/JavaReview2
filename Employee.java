/**
	File name: Employee.java
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
public class Employee extends Person {
    
    private String office;
    private double salary;
    private MyDate dateHired;
    
    public Employee()
    {
        super();
        office = "1A";
        salary = 80000;
        dateHired = new MyDate();
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }

}
