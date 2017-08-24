package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

import data.ColorData;
import data.GameData;
import data.GraphicsData;
import main.Game;

@SuppressWarnings("serial")
public class Renderer extends JPanel implements GameData, ColorData, GraphicsData {
	private static Graphics2D g;

	@Override
	public void paintComponent(Graphics g0) {
		g = (Graphics2D) g0;
		setBackground(COLOR_BACKGROUND);
		super.paintComponent(g);
		try {
			drawGrid();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void drawGrid() {
		for (int q = -GRID_SIZE/2;q<=GRID_SIZE/2;q++) {
			for (int r = -GRID_SIZE/2;r<=GRID_SIZE/2;r++) {
				for (int s = -GRID_SIZE/2;s<=GRID_SIZE/2;s++) {
					if (q+r+s==0) {
						double x = (1.5*q)*CELL_SIZE;
						double y = (0.86602540378*q+1.73205080757*r)*CELL_SIZE;
						Color color = Color.BLACK;
						boolean hasN = Game.grid.get(q, r, s).getN()!=0;
						drawHex((int)x+Window.centerX(), (int)y+Window.centerY(), CELL_SIZE, 2, color, hasN);
					}
				}
			}
		}
	}

	private static void drawHex(int x, int y, int size, int strokeSize, Color color, boolean fill) {
		g.setStroke(new BasicStroke(strokeSize));
		g.setColor(color);
		Polygon hex = getHexagon(x,y,size);
		if (fill) g.fill(hex);
		else g.draw(hex);
	}

	private static Polygon getHexagon(int x, int y, int size) {
		Polygon hexagon = new Polygon();
		double a;
		for (int i = 0;i<7;i++) {
			a = Math.PI/3.0*i+0.523599d;
			hexagon.addPoint((int)(Math.round(x+Math.sin(a)*size)),(int)(Math.round(y+Math.cos(a)*size)));
		}
		return hexagon;
	}





	public static Graphics2D getG() {
		return g;
	}
}
