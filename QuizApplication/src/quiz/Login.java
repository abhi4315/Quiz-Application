package quiz;

import java.awt.Color;

import java.awt.Font;

import javax.swing.*;

import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
 
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
	
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0, 0, 500, 470);
		add(image);
		
		JLabel heading = new JLabel("Java  Quiz");
		heading.setBounds(630, 80,300, 45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name = new JLabel("Enter Your Name");
		name.setBounds(670, 150,300, 45);
		name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		name.setForeground(Color.black);
		add(name);
		
		tfname = new JTextField();
		tfname.setBounds(600, 200, 300, 30);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(tfname);
			
		rules = new JButton("Rules");
		rules.setBounds(610, 260, 120, 30);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.white);
		rules.addActionListener(this);
		add(rules);
		
		back = new JButton("Back");
		back.setBounds(770, 260, 120, 30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		setSize(1000,500);
		setLocation(400,100);
		
		setVisible(true);
	}
	
	public void actionPerformed (ActionEvent ae) {
		if (ae.getSource()==rules) {
			String name = tfname.getText();
			setVisible(false);
			new Rules(name);
		}
		else if (ae.getSource()==back) {
			setVisible(false);
		}
	}
	public static void main(String args[]) {
		new Login();
	}
}
