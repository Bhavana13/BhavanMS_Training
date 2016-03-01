import java.awt.EventQueue;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection = SqliteConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 591, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(205, 82, 109, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(296, 77, 219, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(205, 147, 109, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(296, 140, 208, 31);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		Image img = new ImageIcon(this.getClass().getResource("/ok-icon1.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = "SELECT * FROM EMPLOYEEINFO WHERE USERNAME = ? AND PASSWORD =? ";
					pstmt = connection.prepareStatement(query);
					pstmt.setString(1,textField.getText());
					pstmt.setString(2,passwordField.getText());
					
					res = pstmt.executeQuery();
					int count = 0;
					while(res.next()){
						count = count+1;
					}
					
					if(count == 1){
						JOptionPane.showMessageDialog(null, "Username and Password is correct");
						frame.dispose();
						EmployeeFrame empfm = new EmployeeFrame();
						empfm.setVisible(true);
						
					}
					else if(count > 1){
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password");
					}
					else{
						JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
					}
                    res.close();
                    pstmt.close();
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"Query not executed");
				}
			}
		});
		btnNewButton.setBounds(311, 219, 129, 31);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Login.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(42, 54, 153, 148);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
