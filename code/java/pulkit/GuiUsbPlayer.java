/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pulkit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * This class displays the main form
 * @author Pulkit Saxena
 * Date 5-Jan-2007
 */
public class GuiUsbPlayer extends JFrame{
//declaring variables
	
 Container cnt;	
 JPanel panelMenuBar;
 JPanel panelLabel;
 JLabel label;
 
 /**
  * This constructor initialises the variables
  * @param formName
  */
 public GuiUsbPlayer(String formName){
    super(formName);

  //creating menu bar
  JMenuBar menuBar = new JMenuBar();
  
  //creating menu 
  JMenu usbPlay = new JMenu("USB-PLAY");
  JMenu help = new JMenu("Help");
  JMenu contact = new JMenu("Contact us");
  
  //creating menu items
  JMenuItem enableUSB = new JMenuItem("Enable-USB");
  JMenuItem disableUSB = new JMenuItem("Disable-USB");
  JMenuItem exit = new JMenuItem("Exit");
  
  JMenuItem helpUSB = new JMenuItem("Usb-Help");
  //JMenuItem aboutUSBplayer = new JMenuItem("About");
  
  JMenuItem contactUS = new JMenuItem("Mail-id");
  
  //adding menu itesm to respective menu
   usbPlay.add(enableUSB);
   usbPlay.add(disableUSB);
   usbPlay.add(exit);
   
   help.add(helpUSB);
   //help.add(aboutUSBplayer);
   
   contact.add(contactUS);
   
    //adding menu to menu bar
   menuBar.add(usbPlay);
   menuBar.add(help); 
   menuBar.add(contact);
   
    //creating panel 
       panelMenuBar = new JPanel(new GridLayout());
       panelMenuBar.add(menuBar);
       panelLabel = new JPanel();
       
       //creatng Label
       label= new JLabel("Pulkit - USB Player");
       label.setBackground(Color.pink);
       label.setForeground(Color.MAGENTA);
       panelLabel.add(label);
     
       
       
       
       //getting conatiner
       cnt = this.getContentPane();
       cnt.setLayout(new BorderLayout());
       cnt.add(panelMenuBar,BorderLayout.PAGE_START);
 	   cnt.add(panelLabel,BorderLayout.CENTER);
       
 	   
         //setting look and feel of frame
 	  setSize(300,250);
 	  JFrame.setDefaultLookAndFeelDecorated(true);
 	  setLocationRelativeTo(null);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setVisible(true);    
          this.setResizable(false);
          
          //creating objects to handle events
       
  GuiUsbPlayerEvntHandler objGuiUsbPlayerEvntHandler =
                new GuiUsbPlayerEvntHandler(this);
   enableUSB.addActionListener(objGuiUsbPlayerEvntHandler);
   disableUSB.addActionListener(objGuiUsbPlayerEvntHandler);
   exit.addActionListener(objGuiUsbPlayerEvntHandler);
   
   helpUSB.addActionListener(objGuiUsbPlayerEvntHandler);
   //aboutUSBplayer.addActionListener(objGuiUsbPlayerEvntHandler);
   contactUS.addActionListener(objGuiUsbPlayerEvntHandler);
   
       
       
       
 }
 
}
