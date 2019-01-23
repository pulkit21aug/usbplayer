/*
 * MainClass.java
 *
 * Created on October 27, 2007, 6:10 PM
 * This file consist of a main class
 * 
 */

package pulkit;
import java.util.*;
/**
 *  This class has main function which is entry to 
 * the program
 * @author Pulkit Saxena
 */
public class MainClass {
    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WelcomeForm welcomeForm = new WelcomeForm("Sasco");
      try
      {
    	   Thread.sleep(5000);
      }catch(Exception e){};
      
      welcomeForm.showGuiUSB();
      }
         
         
    }
    

