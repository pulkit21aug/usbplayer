/*
 * WinRegKeyException.java
 *
 * Created on October 27, 2007, 11:00 PM
 *
 *This class handles run time exception
 *
 */

package pulkit;

/**
 * This class handles the exception
 * @author Pulkit Saxena
 */
public class WinRegKeyException extends RuntimeException {
    /** Creates a new instance of WinRegKeyException */
    public WinRegKeyException() {
    
    }
    public WinRegKeyException(String why){
        super(why);
    
        System.out.println(why);
    
    }
}
    
