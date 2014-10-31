import java.awt.Color;
import java.awt.Polygon;
import java.util.Random;

public class CoolPolygon extends Polygon {
	private Color c;
	Random random = new Random();

	public CoolPolygon(int[] x, int[] y, int np) {
		super(x, y, np);
		int rand = random.nextInt(10);

		switch (rand) {
		case 0:
			c = Color.RED;
			break;
		case 1:
			c = Color.GREEN;
			break;
		case 2:
			c = Color.BLUE;
			break;
		case 3:
			c = Color.CYAN;
			break;
		case 4:
			c = Color.ORANGE;
			break;
		case 5:
			c = Color.MAGENTA;
			break;
		case 6:
			c = Color.PINK;
			break;
		}

	}

	public Color getColor() {
		return c;
	}
}
