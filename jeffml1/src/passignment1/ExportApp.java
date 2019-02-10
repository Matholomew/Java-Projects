package passignment1;

import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * The Export Application class that initializes the other classes and feeds the appropriate values to each
 * @author Matthew
 *
 */
public class ExportApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<PaperExports> exports = new ArrayList<PaperExports>();
		BaseReader reader = new BaseReader();
		reader.read(exports);
		
		AssignmentGui gui = new AssignmentGui(exports);
		gui.setVisible(true);
		gui.createAPieGraph();
		gui.createABarChartTab();
		
	}

}
