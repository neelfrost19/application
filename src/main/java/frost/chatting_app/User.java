/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frost.chatting_app;

/**
 *
 * @author Frost
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class User extends JFrame implements ActionListener{
    JPanel main; // should be frame size;, add everything to main now not frame
    JPanel p1;
    JPanel p2;
    JSplitPane splitPane; // gotta split, to use 2 panel
   User()
   {    /*main panel prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
       main = new JPanel();
       main.setLayout(null);
       main.setSize(500,700);
       main.setLocation(0,0);
       
       
       
       
       /*main panel prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
       
       
    
       
       /*panel1 prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
       p1 = new JPanel();
       p1.setBackground(Color.red);
       p1.setSize(500,50);
       p1.setLocation(0,0);
       p1.setLayout(null);
       main.add(p1);
       /*panel1 prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
       
       /*
       splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);  // we want it to split the window verticaly
        splitPane.setDividerLocation(350);                    // the initial position of the divider is 200 (our window is 400 pixels high)
        splitPane.setTopComponent(p1);                  // at the top we want our "topPanel"
        splitPane.setBottomComponent(p2); 
       */
       
       /*panel2 prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
      p2 = new JPanel();
      p2.setBackground(Color.black);
      p2.setSize(500,50);
      p2.setLocation(0,650);
      p2.setLayout(null);
      main.add(p2);
       
       /*panel2 prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
       //splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, p1, p2); 
       
      /*back icon----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
     ImageIcon icon1= new ImageIcon(ClassLoader.getSystemResource("icons/3.png")); //imageImport
     Image icon1rescale = icon1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT); //imagescale
     ImageIcon i1 = new ImageIcon(icon1rescale);// calling constructor 
     JLabel label1= new JLabel(i1);
     label1.setBounds(5, 10, 30, 30);//location
     p1.add(label1);
       
       
       /*back icon----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
       
       
      /*back icon task ----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
    label1.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e)
            {System.exit(0);} });
     /*back icon task ----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
    
     
     
     //more icon---------------------------------------------------------------------------------------------------
    ImageIcon icon2= new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png")); //imageImport
    Image icon2rescale = icon2.getImage().getScaledInstance(13, 18, Image.SCALE_DEFAULT); //imagescale
    ImageIcon i2 = new ImageIcon(icon2rescale);// calling constructor 
    JLabel label2= new JLabel(i2);
    label2.setBounds(5, 17, 930, 19);//location
    p1.add(label2);
    //more icon --------------------------------------------------------------------------------------------------
     
     //more icon task----------------------------------------------------------------------------------------------
    label2.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e)
            {
                //System.exit(0);
            } });
    //more icon task----------------------------------------------------------------------------------------------
    
    //send icon---------------------------------------------------------------------------------------------------
    ImageIcon icon3= new ImageIcon(ClassLoader.getSystemResource("icons/4.png")); //imageImport
    Image icon3rescale = icon3.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT); //imagescale
    ImageIcon i3 = new ImageIcon(icon3rescale);// calling constructor 
    JLabel label3= new JLabel(i3);
    label3.setBounds(370, 450, 750, 19);//posx,posy,width,height
    p2.add(label3);
    //send icon --------------------------------------------------------------------------------------------------
    
    //send icon task----------------------------------------------------------------------------------------------
    label3.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e)
            {
                //System.exit(0);
            } });
    //send icon task----------------------------------------------------------------------------------------------
     
    
      
 
     
       
   /*frame prop----------------------------------------------------------------------------------------------------------------------
   --------------------------------------------------------------------------------------------------------------------------------*/
  // getContentPane().setBackground(Color.blue);//getContenpane gets the full Jframe
   setSize(500,700);
   setLayout(null);
   setLocation(0,0);
   add(main);
   
   setUndecorated(true);
   setVisible(true);
   
   /*frame prop----------------------------------------------------------------------------------------------------------------------
   --------------------------------------------------------------------------------------------------------------------------------*/
   }
   
   public static void main(String[] args)
   {
   User u1 = new User();
   }
//help
   //help
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
