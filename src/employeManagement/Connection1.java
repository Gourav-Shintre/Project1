package employeManagement;
import java.sql.*;

public class Connection1 {

	//public Object s;
	Connection c;
    Statement s;

	public Connection1() {
		// TODO Auto-generated constructor stub
	
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            c = DriverManager.getConnection("jdbc:mysql:///employemanagementsystem", "root", "gour@v02");
	            s = c.createStatement();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	}


