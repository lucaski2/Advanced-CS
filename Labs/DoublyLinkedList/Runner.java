import javax.swing.JFrame;

public class Runner{
	public static void main(String args[]){
		Scenery game = new Scenery();
		JFrame frame = new JFrame("Scenery");
		
		frame.add(game);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
