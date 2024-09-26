import javax.swing.JFrame;

public class Runner{
	public static void main(String args[]){
		Table game = new Screen();
		JFrame frame = new JFrame("BlackJack");
		
		frame.add(game);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
