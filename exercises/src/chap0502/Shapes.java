package chap0502;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int choice;
	
	private final int numberOfPaints = 30;
	
	public Shapes(int choice){
		this.choice = choice;		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int centerX = this.getWidth()/2;
		int centerY = this.getHeight()/2;
		
		for (int i=0; i<this.numberOfPaints; i++){
			switch (this.choice){
				case 1:
					g.drawRect(centerX - (i+1)*5, centerY - (i+1)*5, (i+1)*10, (i+1)*10);
					break;
				case 2:
					g.drawOval(centerX - (i+1)*5, centerY - (i+1)*5, (i+1)*10, (i+1)*10);
					break;
			}
		}
	}

}
