package pwindowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class OneButtonGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private Random rand = new Random();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public OneButtonGui() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnButton = new JButton("Exit");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnButton.setBounds(39, 228, 89, 23);
		contentPane.add(btnButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField_1.getText());
				int result = (num1 + num2);
				textField_2.setText(Integer.toString(result));
			}
		});
		btnAdd.setBounds(317, 42, 89, 23);
		contentPane.add(btnAdd);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(178, 43, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Num:");
		lblNewLabel.setBounds(122, 46, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setBounds(178, 74, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblndNum = new JLabel("2nd Num:");
		lblndNum.setBounds(122, 77, 46, 14);
		contentPane.add(lblndNum);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(122, 126, 46, 14);
		contentPane.add(lblResult);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setBounds(178, 123, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnFillWith = new JButton("Fill with 2 random numbers");
		btnFillWith.addActionListener(new BtnFillWithActionListener());
		btnFillWith.setBounds(39, 179, 172, 23);
		contentPane.add(btnFillWith);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new BtnSubtractActionListener());
		btnSubtract.setBounds(317, 73, 89, 23);
		contentPane.add(btnSubtract);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new BtnMultiplyActionListener());
		btnMultiply.setBounds(317, 107, 89, 23);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new BtnDivideActionListener());
		btnDivide.setBounds(317, 141, 89, 23);
		contentPane.add(btnDivide);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new BtnClearActionListener());
		btnClear.setBounds(317, 228, 89, 23);
		contentPane.add(btnClear);
	}
	private class BtnFillWithActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int  n = rand.nextInt(100);
			int  s = rand.nextInt(100);
			textField.setText(Integer.toString(n));
			textField_1.setText(Integer.toString(s));
		}
	}
	private class BtnSubtractActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(textField.getText());
			int num2 = Integer.parseInt(textField_1.getText());
			int result = (num1 - num2);
			textField_2.setText(Integer.toString(result));
		}
	}
	private class BtnMultiplyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(textField.getText());
			int num2 = Integer.parseInt(textField_1.getText());
			int result = (num1 * num2);
			textField_2.setText(Integer.toString(result));
		}
	}
	private class BtnDivideActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(textField.getText());
			int num2 = Integer.parseInt(textField_1.getText());
			int result = (num1 / num2);
			textField_2.setText(Integer.toString(result));
		}
	}
	private class BtnClearActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		textField.setText("0");
		textField_1.setText("0");
		textField_2.setText("0");
		}
	}
}
