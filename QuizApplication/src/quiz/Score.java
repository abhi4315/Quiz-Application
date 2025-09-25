package quiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {
    
//    JLabel qno;
//    JButton back;

    
    Score(String name, int score) {
        setBounds(400,150, 750, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 200, 300, 250);
        add(image);

       
        JLabel heading = new JLabel("Thank You " + name + " For Completing Quiz");
        heading.setBounds(150, 100, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        heading.setForeground(new Color(30,144,255));
        add(heading);
        
        JLabel userscore = new JLabel("Your Score is :"+score);
        userscore.setBounds(420, 280, 300, 30);
        userscore.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        userscore.setForeground(new Color(30,144,255));
        add(userscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(480, 380, 120, 40);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.white);
       
    
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        

    }

    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login(); 
    }

   
    public static void main(String args[]) {
        new Score("user", 0);
    }
}
