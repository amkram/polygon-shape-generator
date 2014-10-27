import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PolygonShapesMain extends JFrame {
	
		private JPanel panel;
		
		public PolygonShapesMain()
		{	
			setDefaultCloseOperation(EXIT_ON_CLOSE);	
			setSize(500, 500);
			panel = new DrawPanel();
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());
			contentPane.add( panel, BorderLayout.CENTER );

			setVisible(true);
			while(true)
				repaint();
		}
	
	
	
	public static void main(String[] args) {
		new PolygonShapesMain();
	}
}

