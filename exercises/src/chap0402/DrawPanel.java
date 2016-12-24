package chap0402;

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
		int steps = 30;
		
		for (int i=0; i<=steps; i++){
			g.drawLine(0, i*(height/steps), (width/steps)*(i+1), height);
			g.drawLine((width/steps)*(i+1), 0, 0, (height/steps)*(steps-i));
			g.drawLine((width/steps)*i, 0, width, (height/steps)*(i+1));
			g.drawLine((width/steps)*i, height, width, (height/steps)*(steps-i));			
		}
	}	
}
