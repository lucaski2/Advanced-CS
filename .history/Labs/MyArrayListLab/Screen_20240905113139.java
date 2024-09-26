import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener
{
    private MyArrayList<Song> songs;
    private JButton randomize = new JButton("Shuffle");
    private JButton addSong = new JButton("Add Song");
    private JButton sort_name = new JButton("Sort by Name");
    private JButton sort_artist = new JButton("Sort by Artist");
    private JButton sort_album = new JButton("Sort by Album");
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

        randomize.setBounds(50, 100, 150, 25);
        randomize.addActionListener(this);
        this.add(randomize);

        addSong.setBounds(50, 150, 150, 25);
        addSong.addActionListener(this);
        this.add(addSong);

        sort_name.setBounds(50, 200, 150, 25);
        sort_name.addActionListener(this);
        this.add(sort_name);

        sort_artist.setBounds(50, 250, 150, 25);
        sort_artist.addActionListener(this);
        this.add(sort_artist);

        sort_album.setBounds(50, 300, 150, 25);
        sort_album.addActionListener(this);
        this.add(sort_album);

        name.setBounds(250, 150, 150, 25);
        this.add(name);

        artist.setBounds(250, 200, 150, 25);
        this.add(artist);

        album.setBounds(250, 250, 150, 25);
        this.add(album);

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

    public void sort
}
