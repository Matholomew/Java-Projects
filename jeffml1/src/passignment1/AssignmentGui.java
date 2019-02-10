package passignment1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 * This class draws the appropriate Java components to the JFrame and controls the buttons
 * @author Matthew
 *
 */
public class AssignmentGui extends JFrame {
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private DefaultTableModel tm = new DefaultTableModel();
	private ArrayList<PaperExports> exports;
	private JComboBox comboBox = new JComboBox();
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private String txtSearch = "";
	private JTextField textField_1;


	/**
	 * draws the appropriate Java components to the JFrame
	 * @param exports Exports array given from the ExportsApp class
	 */
	public AssignmentGui(ArrayList<PaperExports> exports) {
		
		this.exports = exports;
		setTitle("Assignment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBackground(new Color(255, 153, 0));
		
		
		tabbedPane.setBounds(10, 6, 683, 457);
		contentPane.add(tabbedPane);
		

		tm = new DefaultTableModel(
				new Object[][] {}, 
				new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"});
		
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255, 255, 255));
			tabbedPane.addTab("Search Engine", (Icon) null, panel, null);
			panel.setLayout(null);
			
			JButton btnDisplayAllItems = new JButton("Display all items");
			btnDisplayAllItems.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			btnDisplayAllItems.setForeground(Color.WHITE);
			btnDisplayAllItems.setBackground(new Color(100, 149, 237));
			btnDisplayAllItems.addActionListener(new BtnDisplayAllItemsActionListener());
			btnDisplayAllItems.setBounds(202, 206, 149, 29);
			panel.add(btnDisplayAllItems);
			
			JButton btnSearchItem = new JButton("Search item");
			btnSearchItem.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			btnSearchItem.setForeground(Color.WHITE);
			btnSearchItem.setBackground(new Color(100, 149, 237));
			btnSearchItem.addActionListener(new ActionListener() {
				/**
				 * Search button
				 */
				public void actionPerformed(ActionEvent e) {
					txtSearch = textField.getText();
					drawTableSearch(txtSearch);
				}
			});
			btnSearchItem.setBounds(202, 108, 149, 29);
			panel.add(btnSearchItem);
			
			JButton btnDisplayEachItem = new JButton("Display selected item");
			btnDisplayEachItem.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			btnDisplayEachItem.setForeground(Color.WHITE);
			btnDisplayEachItem.setBackground(new Color(100, 149, 237));
			btnDisplayEachItem.addActionListener(new BtnDisplayEachItemActionListener());
			btnDisplayEachItem.setBounds(28, 206, 156, 29);
			panel.add(btnDisplayEachItem);
			
			textField = new JTextField();
			textField.setBorder(new LineBorder(Color.BLACK, 1, true));
			textField.setBounds(28, 109, 156, 26);
			panel.add(textField);
			textField.setColumns(10);
			comboBox.setForeground(Color.WHITE);
			comboBox.setBackground(new Color(100, 149, 237));
			comboBox.setBorder(new LineBorder(Color.BLACK, 1, true));
			
			
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "Quarter", "Country", "NZ Port", "Product Type", "Export Quantity"}));
			comboBox.setBounds(28, 146, 156, 27);
			panel.add(comboBox);
			
			
			JButton btnSort = new JButton("Sort");
			btnSort.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			btnSort.setForeground(Color.WHITE);
			btnSort.setBackground(new Color(100, 149, 237));
			btnSort.addActionListener(new ActionListener() {
				/**
				 * Button that sorts the data according to what the user has selected in the combo box
				 */
				public void actionPerformed(ActionEvent e) {
					String selectedSort = comboBox.getSelectedItem().toString();
					switch (selectedSort) {
					case "NZ Port":
						PaperExports.nZSort(exports);
						break;
					case "Quarter":
						PaperExports.quarterSort(exports);
						break;
					case "Country":
						PaperExports.countrySort(exports);
						break;
					case "Year":
						PaperExports.yearSort(exports);
						break;
					case "Product Type":
						PaperExports.productTypeSort(exports);
						break;
					case "Export Quantity":
						PaperExports.exportQuantitySort(exports);
						break;
					default:
						break;
					}
						
						drawTable();
						tabbedPane.setSelectedIndex(1);
				}
			});
			btnSort.setBounds(202, 145, 149, 29);
			panel.add(btnSort);
			
			JLabel lblPaperExports = new JLabel("Paper Exports Database");
			lblPaperExports.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblPaperExports.setBounds(210, 11, 274, 37);
			panel.add(lblPaperExports);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Mode", "Mean", "Median", "Minimum", "Maximum"}));
			comboBox_1.setForeground(Color.WHITE);
			comboBox_1.setBorder(new LineBorder(Color.BLACK, 1, true));
			comboBox_1.setBackground(new Color(100, 149, 237));
			comboBox_1.setBounds(468, 146, 156, 27);
			panel.add(comboBox_1);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Year", "Export Quantity"}));
			comboBox_2.setForeground(Color.WHITE);
			comboBox_2.setBorder(new LineBorder(Color.BLACK, 1, true));
			comboBox_2.setBackground(new Color(100, 149, 237));
			comboBox_2.setBounds(468, 109, 156, 27);
			panel.add(comboBox_2);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBorder(new LineBorder(Color.BLACK, 1, true));
			textField_1.setBounds(468, 246, 156, 26);
			panel.add(textField_1);
			
			JButton button = new JButton("Sort");
			button.addActionListener(new ActionListener() {
				/**
				 * Button that checks to see what calculation the user wants to do on the data
				 */
				public void actionPerformed(ActionEvent arg0) {
					String selectedSort1 = comboBox_1.getSelectedItem().toString();
					String selectedSort = comboBox_2.getSelectedItem().toString();
					switch (selectedSort) {
					case "Year":
						switch (selectedSort1) {
						case "Mode":
							textField_1.setText(Integer.toString(PaperExports.yearModeSort(exports)));
							break;
						case "Mean":
							textField_1.setText(Integer.toString(PaperExports.meanYearSort(exports)));
							break;
						case "Median":
							textField_1.setText(Integer.toString(PaperExports.medianYearSort(exports)));
							break;
						case "Minimum":
							textField_1.setText(Integer.toString(PaperExports.findMinYear(exports)));
							break;
						case "Maximum":
							textField_1.setText(Integer.toString(PaperExports.findMaxYear(exports)));
							break;
						default:
							break;
						}
						break;
					case "Export Quantity":
						switch (selectedSort1) {
						case "Mode":
							textField_1.setText(Integer.toString(PaperExports.expQuanModeSort(exports)));
							break;
						case "Mean":
							textField_1.setText(Integer.toString(PaperExports.meanExpQuanSort(exports)));
							break;
						case "Median":
							textField_1.setText(Integer.toString(PaperExports.medianExpQuanSort(exports)));
							break;
						case "Minimum":
							textField_1.setText(Integer.toString(PaperExports.findMinExpQuan(exports)));
							break;
						case "Maximum":
							textField_1.setText(Integer.toString(PaperExports.findMaxExpQuan(exports)));
							break;
						default:
							break;
						}
						break;
					default:
						break;
					}
						
						drawTable();
				}
			});
			button.setForeground(Color.WHITE);
			button.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			button.setBackground(new Color(100, 149, 237));
			button.setBounds(468, 206, 149, 29);
			panel.add(button);
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\Matthew\\Documents\\BITY2\\Java Workspace\\PAssignment1\\hive.png"));
			label.setBounds(0, 0, 693, 429);
			panel.add(label);
			
			
			JScrollPane scrollPane = new JScrollPane();
			tabbedPane.addTab("Table", null, scrollPane, null);
			
			table = new JTable();
			table.setModel(tm);
			Color myColor = Color.decode("#FFF5C3");
			table.setBackground(myColor);
			scrollPane.setViewportView(table);
		drawTable();
		
		
	}
	
	/**
	 * Draws all of the PaperExports data to the table
	 */
	public void drawTable()
	{
		tm.setRowCount(0);
		for(int i = 0; i < 125; i++)
		{
			Object[] object = new Object[6];
			object[0] = exports.get(i).getYear();
			object[1] = exports.get(i).getQuarter();
			object[2] = exports.get(i).getCountry();
			object[3] = exports.get(i).getnZPort();
			object[4] = exports.get(i).getProductType();
			object[5] = exports.get(i).getExportQuantity();
			tm.addRow(object);
		}
	}
	
	/**
	 * Draws the selected param txtSearch data to the table
	 * @param txtSearch The users search string 
	 */
	public void drawTableSearch(String txtSearch)
	{
		tm.setRowCount(0);
		Object[] object = new Object[6];
		for(int i = 0; i < 125; i++)
		{
			switch (txtSearch) {
			case "Country":
				object[2] = exports.get(i).getCountry();
				break;
			
			case "Year":
				object[0] = exports.get(i).getYear();
				break;
				
			case "Quarter":
				object[1] = exports.get(i).getQuarter();
				break;
				
			case "Product Type":
				object[4] = exports.get(i).getProductType();
				break;
				
			case "Export Quantity":
				object[5] = exports.get(i).getExportQuantity();
				break;
				
			case "NZ Port":
				object[3] = exports.get(i).getnZPort();
				break;

			default:
				break;
			}
			tm.addRow(object);
		}
	}
	
	/**
	 * Button that displays individual items from the comboBox
	 * @author Matthew
	 *
	 */
	private class BtnDisplayEachItemActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String txtSearch = comboBox.getSelectedItem().toString();
			drawTableSearch(txtSearch);
			tabbedPane.setSelectedIndex(1);
		}
	}
	
	/**
	 * Button that displays all data into the table
	 * @author Matthew
	 *
	 */
	private class BtnDisplayAllItemsActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				drawTable();
				tabbedPane.setSelectedIndex(1);
		}
	}
	
	
	/**
	 * Creates the pie graph and sets the appropriate PaperExports data accordingly
	 */
	public void createAPieGraph()
	{
		//create data
		DefaultPieDataset data = new DefaultPieDataset();
		for(int i = 0; i < 125; i++)
		{
			data.setValue(exports.get(i).getnZPort(), exports.get(i).getExportQuantity());
		}
		
		//create a chart
		JFreeChart chart = ChartFactory.createPieChart("NZ Port Export Rates", data, true, true, Locale.ENGLISH);
		Color myColor = Color.decode("#EB6E44");
		chart.getPlot().setBackgroundPaint( myColor );
		
		//create and display a frame
		ChartPanel myPanel = new ChartPanel(chart);
		myPanel.setVisible(true);
		
		//add to my Tabbed Panel
		tabbedPane.add("Pie Graph", myPanel);
	}
	
	
	/**
	 * Create the bar graph and sets the appropriate PaperExports data accordingly
	 */
	public void createABarChartTab() {
		//create a dataset
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		//the middle parameter is the series name
		for(int i = 0; i < 125; i++)
		{
			dataset.addValue(exports.get(i).getExportQuantity(), exports.get(i).getnZPort(), Integer.toString(exports.get(i).getYear()));
		}
		
		
		JFreeChart chart = ChartFactory.createBarChart("NZ Port Yearly Exports", "Years", "Export Quantity", dataset, PlotOrientation.VERTICAL, true, true, false);
		Color myColor = Color.decode("#8DC3E9");
		chart.getPlot().setBackgroundPaint( myColor );
		ChartPanel myPanel3 = new ChartPanel(chart);
		tabbedPane.add("Bar graph", myPanel3);
	}
}


