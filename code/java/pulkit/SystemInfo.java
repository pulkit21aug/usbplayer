/*
 * SystemInfo.java
 *
 * Created on October 27, 2007, 6:11 PM
 *This java file consists  of a class which gets the name of
 *the person who have logged on the machine.The object of the class
 *can be used to access the windows registry
 * 
 */

package pulkit;
import java.util.*;
/**
 * This class object access the windows registry for 
 * system login information .
 * @author Pulkit Saxena
 */
public class SystemInfo {
    
    private int root;
    private String path;
    public static final int HKEY_LOCAL_MACHINE = 0x80000002;
    
    /** Creates a new instance of SystemInfo
    *  @param  theRoot  HKEY_CURRENT_USER
    *  @param  tehPath of the registry key
    */
    public SystemInfo(int theRoot ,String thePath) {
    root =theRoot;
    path =thePath;
            
    }
   
    /* Enumerates all the names of registry entries  under the path
     * that thi object describes
     * @return an enumeration listing all entry names
     */
    
     public Enumeration  names() 
     {
         return new WinRegKeyName(root,path);
     }
    
    /**
      Gets the value of registry entry
      @param name of the entry name
      @return the associted value  
   
    */  
      
  public native Object getValue(String name);    
      
  
  /**
   * This function sets the value for subkey
   * 
   */  
 public native void setValue(String name,Object value);
  
  
  /**
   *calling native library 
   */
     
  
  static 
  {
      System.loadLibrary("WinRegKey");
  }
 
  }     
