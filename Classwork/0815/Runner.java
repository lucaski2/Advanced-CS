import javax.swing.JFrame;
public class Runner{
	public static void main(String args[]){
		Screen calc = new Screen();
		JFrame frame = new JFrame("Calculator");
		
		frame.add(calc);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
