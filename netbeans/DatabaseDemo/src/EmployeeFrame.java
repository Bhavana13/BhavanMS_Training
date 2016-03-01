import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class EmployeeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeFrame frame = new EmployeeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
  
	Connection connection = null;
	private JTable table;
  
	/**
	 * Create the frame.
	 */
	public EmployeeFrame() {
		connection = SqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Load Database");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String query = "SELECT * FROM EMPLOYEEINFO";
					Statement stmt = connection.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		btnNewButton.setBounds(164, 25, 125, 23);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(51, 199, 426, -106);
		contentPane.add(table);
		
	
		
		
	}
}
