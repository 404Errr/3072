package input;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.event.MouseInputListener;

import data.GameData;
import main.Game;

public class Input implements KeyListener, MouseInputListener, MouseWheelListener, ComponentListener, WindowListener, GameData {
	@Override
	public void keyPressed(KeyEvent e) {
		try {
			switch (e.getKeyCode()) {
			case (KeyEvent.VK_W):
				Game.move(U);
				break;
			case (KeyEvent.VK_E):
				Game.move(UR);
				break;
			case (KeyEvent.VK_D):
				Game.move(DR);
				break;
			case (KeyEvent.VK_S):
				Game.move(D);
				break;
			case (KeyEvent.VK_A):
				Game.move(DL);
				break;
			case (KeyEvent.VK_Q):
				Game.move(UL);
				break;
			case (KeyEvent.VK_R):
				Game.grid.rotate(1);
				break;
			}
		}
		catch (Exception e1) {e1.printStackTrace();}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		try {
			switch (e.getKeyCode()) {

			}
		}
		catch (Exception e1) {e1.printStackTrace();}
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Cursor.updateMouse(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Cursor.updateMouse(e);
	}

	public static void click(MouseEvent e, boolean down) {
		Cursor.click(e, down);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Cursor.updateMouse(e);
		click(e, true);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Cursor.updateMouse(e);
		click(e, false);
	}

	@Override
	public void componentResized(ComponentEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void componentHidden(ComponentEvent e) {}
	@Override
	public void componentMoved(ComponentEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void componentShown(ComponentEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}
}