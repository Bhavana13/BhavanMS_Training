import java.sql.*;
import javax.swing.*;

public class SqliteConnection {
     Connection conn = null;
     
     public static Connection dbConnector(){
    	 try{
    		 Class.forName("org.sqlite.JDBC");
    		 Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mickey\\workspacemars\\Employees.sqlite");
    		 JOptionPane.showMessageDialog(null,"Connection was established successfully");
    		 return conn;
    	 }catch(Exception e){
    		 JOptionPane.showMessageDialog(null, e);
    		 return null;
    	 }
     }
}
