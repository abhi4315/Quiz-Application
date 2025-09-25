package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {
    String name;
    JLabel rules;
    JButton start,back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.red);
        setLayout(null);
        setSize(800, 650);
        setLocation(350, 100);

        JLabel heading = new JLabel("Hello " + name+ " Welcome");
        heading.setBounds(200, 100, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 34));
        heading.setForeground(Color.white);
        add(heading);

        rules = new JLabel();
        rules.setBounds(160, 130, 700, 400); 
        rules.setFont(new Font("Tahoma", Font.PLAIN, 20));
        rules.setForeground(Color.white);
        rules.setText(
            "<html>" +
                "<body style='width:650px'>" + 
                "1. You will have 15 seconds for each question.<br><br>" +
                "2. Once you select an answer, it cannot be changed.<br><br>" +
                "3. Each correct answer gives you 10 points.<br><br>" +
                "4. No negative marking for wrong answers.<br><br>" +
                "5. Do not minimize or close the window during the quiz.<br><br>" +
                "</body>" +
            "</html>"
        );
        add(rules);

        setVisible(true);
        
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
		add(back);
		
		start = new JButton("Start");
		start.setBounds(400, 500, 100, 30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.white);
		start.addActionListener(this);
		add(start);
    }
    
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource()==start) {
    		setVisible(false);
    		new Quiz(name);
    	}
    	else {
    		setVisible(false);
    		new Login();
    	}
    }

    public static void main(String args[]) {
        new Rules("User");
    }
}
