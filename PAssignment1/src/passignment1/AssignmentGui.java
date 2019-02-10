package passignment1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AssignmentGui extends JFrame {
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tm = new DefaultTableModel();
	private ArrayList<PaperExports> exports = new ArrayList<PaperExports>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignmentGui frame = new AssignmentGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//exports.add(new PaperExports blah)
	}

	/**
	 * Create the frame.
	 */
	public AssignmentGui() {
		setTitle("Assignment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 793);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 570, 738);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Table", null, scrollPane, null);
		
		table = new JTable();
		

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Graph", null, panel_1, null);

		tm = new DefaultTableModel(
				new Object[][] {}, 
				new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"});
		table.setModel(tm);
		scrollPane.setViewportView(table);
		
		
			JPanel panel = new JPanel();
			tabbedPane.addTab("Calculation", null, panel, null);
			panel.setLayout(null);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			comboBox.setBounds(320, 479, 156, 27);
			panel.add(comboBox);
			
			JButton btnDisplayAllItems = new JButton("Display all items");
			btnDisplayAllItems.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String selectedSort = comboBox.getSelectedItem().toString();
					System.out.println(selectedSort);
				}
			});
			btnDisplayAllItems.setBounds(327, 584, 149, 29);
			panel.add(btnDisplayAllItems);
			
			JButton btnSearchItem = new JButton("Search Country");
			btnSearchItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			
			btnSearchItem.setBounds(51, 194, 149, 29);
			panel.add(btnSearchItem);
			
			JButton btnDisplayEachItem = new JButton("Display each item");
			btnDisplayEachItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//String whatToSearch = textField.getText();
					//System.out.println(whatToSearch);
					
				//	if(whatToSearch == exports.get)
				}
			});
			btnDisplayEachItem.setBounds(66, 584, 149, 29);
			panel.add(btnDisplayEachItem);
			
			
			
			
			
			JButton btnSort = new JButton("Sort");
			btnSort.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnSort.setBounds(327, 517, 127, 14);
			panel.add(btnSort);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(222, 74, 156, 27);
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			panel.add(comboBox_1);
			
			JButton btnSearchYear = new JButton("Search Year");
			btnSearchYear.setBounds(51, 73, 149, 29);
			panel.add(btnSearchYear);
			
			JButton btnSearchExportQuantity = new JButton("Search Export Quantity");
			btnSearchExportQuantity.setBounds(51, 234, 149, 29);
			panel.add(btnSearchExportQuantity);
			
			JButton btnSearchProductType = new JButton("Search Product Type");
			btnSearchProductType.setBounds(51, 274, 149, 29);
			panel.add(btnSearchProductType);
			
			JButton btnSearchNzPort = new JButton("Search NZ Port");
			btnSearchNzPort.setBounds(51, 154, 149, 29);
			panel.add(btnSearchNzPort);
			
			JButton btnSearchQuarter = new JButton("Search Quarter");
			btnSearchQuarter.setBounds(51, 113, 149, 29);
			panel.add(btnSearchQuarter);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(222, 112, 156, 27);
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			panel.add(comboBox_2);
			
			JComboBox comboBox_3 = new JComboBox();
			comboBox_3.setBounds(222, 155, 156, 27);
			comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			panel.add(comboBox_3);
			
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4.setBounds(222, 195, 156, 27);
			comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			panel.add(comboBox_4);
			
			JComboBox comboBox_5 = new JComboBox();
			comboBox_5.setBounds(222, 234, 156, 27);
			comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			panel.add(comboBox_5);
			
			JComboBox comboBox_6 = new JComboBox();
			comboBox_6.setBounds(222, 274, 156, 27);
			comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			panel.add(comboBox_6);
		drawTable();
	}
	
	public void drawTable()
	{
		tm.setRowCount(0);
		for(int i = 0; i < 100; i++)
		{
			Object[] object = new Object[6];
			object[0] = "exports.get(i).getYear()";
			object[1] = "exports.get(i).getQuarter()";
			object[2] = "exports.get(i).getCountry()";
			object[3] = "exports.get(i).getNZPort()";
			object[4] = "exports.get(i).getProductType()";
			object[5] = "exports.get(i).getExportQuantity()";
			tm.addRow(object);
		}
	}
}
