import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener
{
    private MyArrayList<Song> songs;
    private JButton randomize = new JButton("Shuffle");
    private JButton addSong = new JButton("Add Song");
    private JButton sort = new JButton("Sort");
    private MyArrayList<JButton> buttons;
    private JTextField name = new JTextField();
    private JTextField artist = new JTextField();
    private JTextField album = new JTextField();

    public Screen()
    {
        setLayout(null);
        songs = new MyArrayList<Song>();
        buttons = new MyArrayList<JButton>();

        




    }

    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
