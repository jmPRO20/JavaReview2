/**
	File name: Person.java
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
public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    public Person()
    {
        name = "Joshua";
        address = "111 Nowhere Drive";
        phoneNumber = "111-222-3333";
        emailAddress = "jm8888@gmail.com";
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + '}';
    }
    
}
