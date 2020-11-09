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
import javax.swing.*;
import java.awt.*;
public class Test extends JFrame{
   /* JPanel p1;
    JPanel p2;
    JSplitPane s;
*/
    
    
    
    Test()
    {
     setSize(500,500);
     setLocation(0,0);
     //setLayout(null);
     /*
    p1=new JPanel();
    p1.setBackground(Color.red);
    p1.setSize(50,50);
    p1.setLocation(50,50);
    //p1.setBounds(50, 50, 0, 0);
    p1.setLayout(null);
    
    //add(p1);
    
    p2 = new JPanel();
     p2.setBackground(Color.black);
    p2.setSize(50,50);
    p2.setLocation(100,100);
    //p2.setBounds(50, 50, 0, 0);
    p2.setLayout(null);
    
    s= new JSplitPane();
    s.setOrientation(JSplitPane.VERTICAL_SPLIT);
     s.setDividerLocation(250);                    // the initial position of the divider is 200 (our window is 400 pixels high)
        s.setTopComponent(p1);                  // at the top we want our "topPanel"
        s.setBottomComponent(p2); 
      //  pack();
      add(s, BorderLayout.CENTER);
*/
     JPanel main = new JPanel();
     main.setSize(500,500);
     main.setLayout(null);
     JPanel p1 = new JPanel();
     JPanel p2 = new JPanel();
     p1.setBackground(Color.red);
     p1.setLayout(null);
     p1.setSize(50,50);
     p1.setLocation(0,0);
     
     p2.setBackground(Color.green);
     p2.setLayout(null);
     p2.setSize(50,50);
     p2.setLocation(100,100);
     main.add(p1);
     main.add(p2);
     add(main);
     
     
     
     
     
     
     
     
     
     
     
     
    setVisible(true);
    }
    
    public static void main(String[] args)
    {
    Test t = new Test();
    }
    
}
