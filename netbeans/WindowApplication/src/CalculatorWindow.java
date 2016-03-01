import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField textField_2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorWindow window = new CalculatorWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 201, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 11, 214, 38);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1,number2,ans;
				
				try{
					number1 = Integer.parseInt(textField.getText());
					number2 = Integer.parseInt(textField_1.getText());
					
					ans = number1+number2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e1){
					JOptionPane.showInternalMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setBounds(59, 71, 89, 38);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("SUBSTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int number1,number2,ans;
				
				try{
					number1 = Integer.parseInt(textField.getText());
					number2 = Integer.parseInt(textField_1.getText());
					
					ans = number1-number2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e1){
					JOptionPane.showInternalMessageDialog(null, "Please enter valid number");
				}

			}
		});
		btnNewButton_1.setBounds(210, 71, 96, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int number1,number2,ans;
				
				try{
					number1 = Integer.parseInt(textField.getText());
					number2 = Integer.parseInt(textField_1.getText());
					
					ans = number1*number2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e1){
					JOptionPane.showInternalMessageDialog(null, "Please enter valid number");
				}

			}
		});
		btnNewButton_2.setBounds(59, 130, 101, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int number1,number2,ans;
				
				try{
					number1 = Integer.parseInt(textField.getText());
					number2 = Integer.parseInt(textField_1.getText());
					
					ans = number1/number2;
					textField_2.setText(Integer.toString(ans));
				}catch(Exception e1){
					JOptionPane.showInternalMessageDialog(null, "Please enter valid number");
				}

			}
		});
		btnNewButton_3.setBounds(210, 129, 96, 41);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 197, 192, 36);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel = new JLabel("ANSWER");
		lblNewLabel.setBounds(59, 203, 55, 25);
		frame.getContentPane().add(lblNewLabel);
	}
}
