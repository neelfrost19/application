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
    JTextField t1;
    JTextArea ta1;
    
    
    
   // JSplitPane splitPane; // gotta split, to use 2 panel
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
       p1.setBackground(new Color(156, 81, 182));//(148,0,211),(156,81,182) 75,0,130)
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
      p2.setBackground(new Color(156, 81, 182));
      p2.setSize(500,50);
      p2.setLocation(0,650);
      p2.setLayout(null);
      main.add(p2);
       
       /*panel2 prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
       
/*textfield prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/

t1= new JTextField();
t1.setSize(370,30);
t1.setLocation(10,10);
t1.setLayout(null);
p2.add(t1);

/*textfield prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/


/*textarea prop----------------------------------------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------------------------------------------------------*/
ta1 = new JTextArea();
ta1.setSize(480,590);
ta1.setLayout(null);
ta1.setLocation(10,55);
ta1.setBackground(Color.pink);
ta1.setEditable(false);
ta1.setLineWrap(true); // line wrap
ta1.setWrapStyleWord(true); //style wrap
main.add(ta1);





/*textarea prop----------------------------------------------------------------------------------------------------------------------
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
    //label3.setBounds(400, 10, 750, 19);//pos x, pos y, width , height
    label3.setBounds(430, 0, 50, 50);
    p2.add(label3);
    //send icon --------------------------------------------------------------------------------------------------
    
    //send icon task----------------------------------------------------------------------------------------------
    label3.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e)
            {
                //System.exit(0);
               ta1.setText(ta1.getText()+"\n\t\t\t"+t1.getText());
               t1.setText(" ");
            } });
    //send icon task----------------------------------------------------------------------------------------------
     
    
      
 
     
       
   /*frame prop----------------------------------------------------------------------------------------------------------------------
   --------------------------------------------------------------------------------------------------------------------------------*/
  //getContentPane().setBackground(Color.black);//getContenpane gets the full Jframe
   setSize(500,700);
   setLayout(null);
   setLocation(0,0);
   main.setBackground(Color.white);
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
