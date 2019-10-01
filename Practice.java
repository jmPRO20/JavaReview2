

/**
	File name: Practice.java
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
public class Practice {

    public static void main(String[] args)
    {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);
        Staff s = new Staff();
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(s.toString());
    }
}
