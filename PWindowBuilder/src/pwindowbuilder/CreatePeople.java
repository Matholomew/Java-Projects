package pwindowbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class CreatePeople extends JFrame {
	
	private JTextArea textArea_1 = new JTextArea();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePeople frame = new CreatePeople();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreatePeople() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new BtnCreateActionListener());
		btnCreate.setBounds(30, 228, 89, 23);
		contentPane.add(btnCreate);
		
		textField = new JTextField();
		textField.setBounds(112, 38, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 69, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 110, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblIdNum = new JLabel("ID num:");
		lblIdNum.setBounds(41, 31, 46, 14);
		contentPane.add(lblIdNum);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(41, 72, 61, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(41, 113, 61, 14);
		contentPane.add(lblLastName);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(252, 38, 115, 92);
		contentPane.add(scrollPane_1);
		textArea_1.setEditable(false);
		
		
		scrollPane_1.setViewportView(textArea_1);
	}
	private class BtnCreateActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textArea_1.append(textField.getText() + ", " + textField_1.getText() + ", " + textField_2.getText() + "\n");
		}
	}
}
