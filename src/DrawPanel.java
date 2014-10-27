import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private int rand;
	private Random random = new Random();
	private ArrayList<Polygon> saved = new ArrayList<Polygon>();
	
	int[] testPointsX = { 400, 300, 100 },
		  testPointsY = { 100, 400, 400 };
	private Polygon test = new Polygon(testPointsX, testPointsY, 3);

	public void paintComponent(Graphics g1) {
		Graphics2D g = (Graphics2D) g1;
		g.setColor(Color.RED);
		

		rand = random.nextInt(8) + 3;
		int[] xPoints = new int[rand];
		int[] yPoints = new int[rand];

		for (int i = 0; i < rand; i++) {
			xPoints[i] = random.nextInt(501);
			yPoints[i] = random.nextInt(501);

		}
		for(int i = 0; i < saved.size(); i++)
			g.fillPolygon(saved.get(i));
		
		Polygon newPolygon = new Polygon(xPoints, yPoints, rand);
		g.fillPolygon(newPolygon);
		
		boolean passes = true;
		for(int i = 0; i < newPolygon.npoints; i++)
			{
				Point p = new Point(newPolygon.xpoints[i], newPolygon.ypoints[i]);
				if(!test.contains(p))
					passes = false;
			}
			if(passes)
				saved.add(newPolygon);
		g.setColor(Color.BLACK);
		g.draw(test);
	
	}
	}
