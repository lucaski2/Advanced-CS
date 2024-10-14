import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class Scenery extends JPanel implements ActionListener
{
    private Image background;
    DLList<JButton> buttons = new DLList<JButton>();
    DLList<DLList<Integer>> animals;
    JButton clear = new JButton("Clear");
    boolean started = false;
    JButton randomize = new JButton("Randomize");
    DLList<JButton> remove_buttons = new DLList<JButton>();

    public Scenery()
    {
        try
        {
            background = ImageIO.read(getClass().getResource("underwater.jpg"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        setLayout(null);

        JButton button1 = new JButton("Fish");
        button1.setBounds(20, 20, 100, 30);
        buttons.add(button1);
        this.add(button1);
        button1.addActionListener(this);

        JButton button2 = new JButton("Crab");
        button2.setBounds(130, 20, 100, 30);
        buttons.add(button2);
        this.add(button2);
        button2.addActionListener(this);

        JButton button3 = new JButton("Starfish");
        button3.setBounds(240, 20, 100, 30);
        buttons.add(button3);
        this.add(button3);
        button3.addActionListener(this);

        JButton button4 = new JButton("Clam");
        button4.setBounds(350, 20, 100, 30);
        buttons.add(button4);
        this.add(button4);
        button4.addActionListener(this);

        JButton button5 = new JButton("Jellyfish");
        button5.setBounds(460, 20, 100, 30);
        buttons.add(button5);
        this.add(button5);
        button5.addActionListener(this);

        clear.setBounds(570, 20, 100, 30);
        this.add(clear);
        clear.addActionListener(this);



        randomize.setBounds(680, 20, 100, 30);
        this.add(randomize);
        randomize.addActionListener(this);

        DLList<String> animal_names = new DLList<String>();
        animal_names.add("Fish");
        animal_names.add("Crab");
        animal_names.add("Starfish");
        animal_names.add("Clam");
        animal_names.add("Jellyfish");

        for (int i = 0; i < 5; i++)
        {
            JButton remove_button = new JButton("Remove " + animal_names.get(i));
            remove_button.setBounds(20 + 130 * i, 60, 130, 30);
            remove_buttons.add(remove_button);
            this.add(remove_button);
            remove_button.addActionListener(this);
        }

        animals = new DLList<DLList<Integer>>();
        try
        {
            java.io.File file = new java.io.File("animals.txt");
            java.util.Scanner input = new java.util.Scanner(file);
            while (input.hasNext())
            {
                DLList<Integer> animal = new DLList<Integer>();
                animal.add(input.nextInt());
                animal.add(input.nextInt());
                animal.add(input.nextInt());
                animals.add(animal);
            }
            input.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }



    }

    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (!started)
        {
            g.drawString("You can save your work or load your past work", 250, 200);
            g.drawString("Press Any button to start", 300, 300);
            repaint();
            return;
        }
        g.drawImage(background, 0, 0, this);
        drawAnimals(g);
        repaint();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (!started)
        {
            started = true;
            return;
        }
        for (int i = 0; i < buttons.size(); i++)
        {
            if (e.getSource() == buttons.get(i))
            {
                DLList<Integer> animal = new DLList<Integer>();
                animal.add(i);
                animal.add((int)(Math.random() * 800));
                animal.add((int)(Math.random() * 600));
                animals.add(animal);
            }
        }
        if (e.getSource() == clear)
        {
            animals = new DLList<DLList<Integer>>();
        }

        else if (e.getSource() == randomize)
        {
            DLList<DLList<Integer>> temp = new DLList<DLList<Integer>>();
            for (int i = 0; i < animals.size(); i++)
            {
                DLList<Integer> animal = animals.get(i);
                animal.set(1, (int)(Math.random() * 800));
                animal.set(2, (int)(Math.random() * 600));
                temp.add(animal);
            }
            animals = temp;
        }

        for (int i = 0; i < remove_buttons.size(); i++)
        {
            if (e.getSource() == remove_buttons.get(i))
            {
                DLList<Integer> indexes = new DLList<Integer>();
                for (int j = 0; j < animals.size(); j++)
                {
                    if (animals.get(j).get(0) == i)
                    {
                        indexes.add(j);
                    }
                }
                if (indexes.size() == 0)
                {
                    return;
                }
                animals.remove(indexes.get((int)(Math.random() * indexes.size())));
            }
        }

        try
        {
            java.io.PrintWriter output = new java.io.PrintWriter("animals.txt");
            for (int i = 0; i < animals.size(); i++)
            {
                DLList<Integer> animal = animals.get(i);
                output.println(animal.get(0) + " " + animal.get(1) + " " + animal.get(2));
            }
            output.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void drawAnimals(Graphics g)
    {
        for (int i = 0; i < animals.size(); i++)
        {
            DLList<Integer> animal = animals.get(i);
            int x = animal.get(1);
            int y = animal.get(2);
            if (animal.get(0) == 0)
            {
                // Fish
                g.setColor(Color.ORANGE);
                g.fillOval(animal.get(1), animal.get(2), 50, 50);
                g.fillPolygon(new int[] {animal.get(1) + 50, animal.get(1) + 75, animal.get(1) + 75}, new int[] {animal.get(2) + 25, animal.get(2) + 10, animal.get(2) + 40}, 3);
                g.setColor(Color.BLACK);
                g.fillOval(animal.get(1) + 7, animal.get(2) + 20, 5, 5);
            }

            else if (animal.get(0) == 1)
            {
                // Crab
                g.setColor(Color.RED);
                g.fillArc(animal.get(1), animal.get(2), 75, 50, 0, 180);
                g.fillRect(animal.get(1) + 10, animal.get(2) + 10, 10, 40);
                g.fillRect(animal.get(1) + 55, animal.get(2) + 10, 10, 40);
                g.setColor(Color.BLACK);
                g.fillOval(animal.get(1) + 20, animal.get(2) + 7, 10, 10);
                g.fillOval(animal.get(1) + 45, animal.get(2) + 7, 10, 10);
            }
            else if (animal.get(0) == 2)
            {
                // Starfish
                g.setColor(new Color(255, 219, 187));
                g.fillRect(animal.get(1), animal.get(2), 10, 50);
                g.fillRect(animal.get(1), animal.get(2) - 50, 10, 50);
                g.fillRect(animal.get(1) - 47, animal.get(2) - 5, 50, 10);
                g.fillRect(animal.get(1) + 3, animal.get(2) - 5, 50, 10);
            }
            else if (animal.get(0) == 3)
            {
                // clam
                g.setColor(new Color(200, 200, 200));
                g.fillArc(animal.get(1), animal.get(2), 50, 20, 0, 180);
                g.setColor(new Color(50, 50, 50));
                g.fillArc(animal.get(1), animal.get(2) - 5, 50, 30, 180, 180);
                
                g.setColor(Color.BLACK);
            }
            else if (animal.get(0) == 4)
            {
                // jellyfish
                g.setColor(Color.PINK);
                g.fillArc(x, y, 85, 50, 0, 180);
                g.fillRect(x, y + 25, 10, 50);
                g.fillRect(x + 25, y + 25, 10, 50);
                g.fillRect(x + 50, y + 25, 10, 50);
                g.fillRect(x + 75, y + 25, 10, 50);
            }
            else 
            {
                throw new IllegalArgumentException("You tampered with the input files!!! >:(");
            }
        }
    }
}
    