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
    private JTextField name = new JTextField("Name");
    private JTextField artist = new JTextField("Artist");
    private JTextField album = new JTextField("Album");

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

        randomize.setBounds(75, 520, 150, 25);
        randomize.addActionListener(this);
        this.add(randomize);

        sort_name.setBounds(225, 520, 150, 25);
        sort_name.addActionListener(this);
        this.add(sort_name);

        sort_artist.setBounds(375, 520, 150, 25);
        sort_artist.addActionListener(this);
        this.add(sort_artist);

        sort_album.setBounds(525, 520, 150, 25);
        sort_album.addActionListener(this);
        this.add(sort_album);

        name.setBounds(50, 550, 150, 25);
        this.add(name);

        artist.setBounds(250, 550, 150, 25);
        this.add(artist);

        album.setBounds(450, 550, 150, 25);
        this.add(album);

        addSong.setBounds(650, 550, 100, 25);
        addSong.addActionListener(this);
        this.add(addSong);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        super.setBackground(Color.WHITE);
        

        for (int i = 0; i < songs.size(); i++)
        {
            g.drawString(songs.get(i).toString(), 300, 50 + 50 * i);
        }

        for (int i = 0; i < buttons.size(); i++)
        {
            buttons.get(i).setBounds(50, 33 + 50 * i, 200, 25);
        }

        repaint();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == randomize)
        {
            shuffle();
        }
        else if (e.getSource() == addSong)
        {
            songs.add(new Song(name.getText(), artist.getText(), album.getText()));
            JButton button = new JButton("Delete");
            button.setBounds(50, 50 + 50 * songs.size(), 200, 25);
            button.addActionListener(this);
            buttons.add(button);
            this.add(button);
        }
        else if (e.getSource() == sort_name)
        {
            sort_by_name();
        }
        else if (e.getSource() == sort_artist)
        {
            sort_by_artist();
        }
        else if (e.getSource() == sort_album)
        {
            sort_by_album();
        }
        else
        {
            for (int i = 0; i < buttons.size(); i++)
            {
                if (e.getSource() == buttons.get(i))
                {
                    songs.remove(i);
                    buttons.remove(i);
                    break;
                }
            }
            System.out.println(buttons.size());
            System.out.println(songs.size());
            repaint();
        }
    }

    private void sort_by_name()
    {
        for (int i = 0; i < songs.size(); i++)
        {
            for (int j = 0; j < songs.size() - 1; j++)
            {
                if (songs.get(j).getName().compareTo(songs.get(j + 1).getName()) > 0)
                {
                    Song temp = songs.get(j);
                    songs.set(j, songs.get(j + 1));
                    songs.set(j + 1, temp);
                }
            }
        }
    }

    public void sort_by_album()
    {
        for (int i = 0; i < songs.size(); i++)
        {
            for (int j = 0; j < songs.size() - 1; j++)
            {
                if (songs.get(j).getAlbum().compareTo(songs.get(j + 1).getAlbum()) > 0)
                {
                    Song temp = songs.get(j);
                    songs.set(j, songs.get(j + 1));
                    songs.set(j + 1, temp);
                }
            }
        }
    }

    public void sort_by_artist()
    {
        for (int i = 0; i < songs.size(); i++)
        {
            for (int j = 0; j < songs.size() - 1; j++)
            {
                if (songs.get(j).getArtist().compareTo(songs.get(j + 1).getArtist()) > 0)
                {
                    Song temp = songs.get(j);
                    songs.set(j, songs.get(j + 1));
                    songs.set(j + 1, temp);
                }
            }
        }
    }

    private void shuffle()
    {
        for (int i = 0; i < songs.size(); i++)
        {
            int random = (int) (Math.random() * songs.size());
            Song temp = songs.get(i);
            songs.set(i, songs.get(random));
            songs.set(random, temp);
        }
    }
}
