package chap0502;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog(
			"Enter 1 to draw rectangles\n" +
			"Enter to to draw circles");
		
		int choice = Integer.parseInt(input);
		
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
		
	}

}
