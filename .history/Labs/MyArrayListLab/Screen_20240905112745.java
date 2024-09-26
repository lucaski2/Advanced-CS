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

        songs.add(new Song("Bohemian Rhapsody", "Queen", "A Night at the Opera"));
        songs.add(new Song("Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV"));
        songs.add(new Song("Hotel California", "Eagles", "Hotel California"));
        songs.add(new Song("Imagine", "John Lennon", "Imagine"));
        songs.add(new Song("What's Going On", "Marvin Gaye", "What's Going On"));

        for (int i = 0; i < songs.size(); i++)
        {
            JButton button = new JButton("Delete");
            button.setBounds(50, 50 + 50 * i, 200, 25);
            button.addActionListener(this);
            buttons.add(button);
            this.add(button);
        }

        randomize.setBounds(50, 50 + 50 * songs.size(), 200, 25);
        







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
