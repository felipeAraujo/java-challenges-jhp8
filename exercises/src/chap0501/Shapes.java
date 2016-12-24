package chap0501;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int numberOfCircles = 12;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int centerX = this.getWidth()/2;
		int centerY = this.getHeight()/2;
		
		for (int i=0; i<this.numberOfCircles; i++){
			g.drawOval(centerX - (i+1)*5, centerY - (i+1)*5, (i+1)*10, (i+1)*10);
		}
	}

}
