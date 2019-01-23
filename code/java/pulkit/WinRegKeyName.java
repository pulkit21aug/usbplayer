/*
 * WinRegKeyName.java
 *
 * Created on October 27, 2007, 9:14 PM
 *
 * This java file consits a class which enumerats all the 
 * keys in rhe registry under the path 
 * 
 */

package pulkit;
import java.util.*;

/**
 * This  class call the native methods to access the windows
 * registry 
 * @author Pulkit Saxena
 */
public class WinRegKeyName implements  Enumeration{
    private int root;
    private String path;
    private int index = -1;
    private int hkey = 0;
    private int maxsize;
    private int count;
    
    public native Object nextElement();
    public native boolean hasMoreElements();
    
    
    /** Creates a new instance of WinRegKeyName
     @param the Root 
     @param thePath
     */
    public WinRegKeyName(int theRoot ,String thePath) {
    
    root = theRoot;
    path = thePath;
    }
    
/**
   *calling native library 
   */
     
  static 
  {
      System.loadLibrary("WinRegKey");
  }


}
