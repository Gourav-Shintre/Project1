package employeManagement;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home extends JFrame implements ActionListener {
	
	JButton update,view,add,remove;

	public Home() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons-20231203T145030Z-001/icons/home.jpg"));
		Image i2 =i1.getImage().getScaledInstance(1120, 630,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image= new JLabel(i3);
		image.setBounds(0,0,1120,630);
		add(image);
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setBounds(620, 20,400 ,40 );
		heading.setFont(new Font("RAILWAY",Font.BOLD,25));
		image.add(heading);
		
		 add = new JButton("Add Employee");
		add.setBounds(650, 80, 150,40 );
		add.addActionListener(this);
		image.add(add);
		
		 view = new JButton("View Employee");
		view.setBounds(820, 80, 150,40 );
		view.addActionListener(this);
		image.add(view);
		
	 update= new JButton("Update Employee");
		update.setBounds(650, 140, 150,40 );
		update.addActionListener(this);
		image.add(update);
		
		 remove = new JButton("Remove Employee");
		remove.setBounds(820, 140, 150,40 );
		remove.addActionListener(this);
		image.add(remove);
		
		
		
		
		setSize(1120,630);
		setLocation(250,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Home();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== add) {
			setVisible(false);
			new AddEmployee();
			
		}else if(e.getSource()== view) {																																																					
			
		}else if(e.getSource()== update)
		{
			
		}else {
			
			
		} {
			
		}
		
	}

}
