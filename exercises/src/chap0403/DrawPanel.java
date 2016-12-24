package chap0403;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int steps = 15;
		
		for (int i=0; i<steps; i++){
			g.drawLine(0, 0, 0 + i*(width/steps), height - i*(height/steps));			
		}
	}	
}
