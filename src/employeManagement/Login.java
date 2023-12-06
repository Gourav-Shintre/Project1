package employeManagement;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	JTextField  tusername,tpassword;
	
	
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lusername=new JLabel("Username");
		lusername.setBounds(40, 20, 100, 30);
		add(lusername);
		 tusername=new JTextField();
		tusername.setBounds(150,20,150,30);
		add(tusername);
		
		
		JLabel lpassword=new JLabel("Password");
		lpassword.setBounds(40, 70, 200, 30);
		add(lpassword);
		 tpassword=new JTextField();
		tpassword.setBounds(150,70,150,30);
		add(tpassword);
		
		JButton login=new JButton("Login");
		login.setBounds(150, 150, 150, 30);
		login.setBackground(Color.BLUE);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons-20231203T145030Z-001/icons/second.jpg"));		
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image= new JLabel(i3);
		image.setBounds(350, 0,200,200);
		add(image);
		
		
		setSize(600, 300);
		setLocation(450, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			
			
			String username = tusername.getText();
			String password = tpassword.getText();
			Connection1 c = new Connection1();
			 
			  String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
			  
			  
			ResultSet rs=c.s.executeQuery(query);
			if(rs.next())
			{
				setVisible(false);
				new Home();
			}else {
				JOptionPane.showMessageDialog(null, "Invalid username and password");
				setVisible(false);
			}
		
			

			
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		
	}

}
