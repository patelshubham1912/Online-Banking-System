

package onlinebanking;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mainproj_log {
     final JFrame frame = new JFrame("[=] Project [=]");
     final JFrame frame1 = new JFrame("[=] Project [=]");

public void Main_proj_1(final JFrame frame1,String user)
{
     frame1.setVisible(false);
     frame.setVisible(true);     
     frame.setSize(1000, 700);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel b=new JLabel("Welcome To Online Banking System");
    Font font1 = new Font("Arial Rounded MT Bold", Font.BOLD, 32);
    b.setFont(font1);
    b.setLocation(200,0);
    b.setSize(1000,100);
  
    JPanel p1=new JPanel();
    p1.setBackground(Color.pink);
    p1.setLayout(null);
    p1.setLocation(0, 0);
    p1.setSize(1000, 100);
    p1.add(b);
  
        JPanel p2 = new JPanel();
        p2.setBackground(Color.black);
        p2.setLayout(null);
        p2.setLocation(0,101);
        p2.setSize(1000,50);
        
        String s="hi "+user;
        JLabel hi=new JLabel(s);
        Font font2 = new Font("Arial", Font.BOLD,20);
         hi.setFont(font2);
         hi.setLocation(800,0);
         hi.setSize(200,50);
         p2.add(hi);
        
         JPanel p3=new JPanel();
         p3.setBackground(Color.cyan);
         p3.setLayout(null);
         p3.setLocation(0,152);
         p3.setSize(300,585);
    
         
        JButton b1 = new JButton("Account");
        b1.setLocation(0,0);
        b1.setSize(300,70 );
        p3.add(b1);
        
        JButton b2 = new JButton("Money Transaction");
        b2.setLocation(0,70);
        b2.setSize(300,70 );
        p3.add(b2);
        
        b2.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e)
        {
           trans t=new trans();
            frame.getContentPane().removeAll();
            frame.validate();
            frame.repaint();
            t.mt(frame);
        }  
         });
        
        JButton b3 = new JButton("ATM");
        b3.setLocation(0,140);
        b3.setSize(300,70 );
        p3.add(b3);
        
        JButton b4 = new JButton("Demand Draft");
        b4.setLocation(0, 210);
        b4.setSize(300,70 );
        p3.add(b4);
        
        JButton b5 = new JButton("E-pay");
        b5.setLocation(0,280);
        b5.setSize(300,70 );
        p3.add(b5);
        
        JButton b6 = new JButton("Contact us");
        b6.setLocation(0,350);
        b6.setSize(300,70 );
        p3.add(b6);
        
        JButton b7 = new JButton("About us");
        b7.setLocation(0, 420);
        b7.setSize(300,70 );
        p3.add(b7);
        
        
        JPanel p4 = new JPanel();
        p4.setBackground(Color.magenta);
        p4.setLocation(300,152 );
        p4.setSize(700,210);
       
        ImageIcon icon=new ImageIcon("D:/OOSE_Project/Moving-picture-flying-dollar-sign-animated-gif.gif");
        JLabel pics=new JLabel();
        pics.setLocation(300,152);
        pics.setSize(700,210);
        pics.setIcon(icon);
        p4.add(pics);
     
                 
        JPanel p5 = new JPanel();
        p5.setBackground(Color.white);
        p5.setLayout(null);
        p5.setLocation(300,362);
        p5.setSize(700,280);
     
        JButton b9 = new JButton("loan");
        b9.setLocation(300,362);
        b9.setSize(350,280);
        p5.add(b9);

        JButton b10 = new JButton("Mobile-recharge");
        b10.setLocation(650,362);
        b10.setSize(350,280);
        p5.add(b10);

        
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        
        
        
}


}
