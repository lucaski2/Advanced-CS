import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener
{
    MyHashSet<Item> items = new MyHashSet<Item>();

//     You will write a graphical user interface for a shopping cart using the Item class and your own MyHashset.  Start the program with 3 items of your choice in the shopping cart.  The program will have the following feature.  
// A list of items will be displayed in the shopping cart.  Include the name, price, and quantity of each item.  Display the number of different items (use the size()).
// The user can add an item from the list by entering the item name, price, and quantity.  (If the user add the same item with a different quantity, remove out the old one and add the new one.)
// The total price of the shopping cart will be displayed and updated.  Make sure to account for quantity. (Use the toDLList to get the list of items and do the calculation.)
// The user can remove item from the cart by entering the item name and price. 
// Have a clear button to clear out the shopping cart.
// The user can quit the program by clicking the quit button.
// Use text fields
    public Screen()
    {
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        add(panel, BorderLayout.WEST);
        JButton add = new JButton("Add");
        add.addActionListener(this);
        panel.add(add);
        JButton remove = new JButton("Remove");
        remove.addActionListener(this);
        panel.add(remove);
        JButton clear = new JButton("Clear");
        clear.addActionListener(this);
        panel.add(clear);
        JButton quit = new JButton("Quit");
        quit.addActionListener(this);
        panel.add(quit);

        // Add 3 items to the shopping cart
        items.add(new Item(5, "apple", 3));
        items.add(new Item(10, "banana", 2));
        items.add(new Item(15, "carrot", 1));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        DLList<Item> list = items.toDLList();
        int total = 0;
        for(int i = 0; i < list.size(); i++)
        {
            Item item = list.get(i);
            g.drawString(item.toString(), 100, 100 + 20 * i);
            total += item.getPrice() * item.getQuantity();
        }
        g.drawString("Total: " + total, 100, 100 + 20 * list.size());
        g.drawString("Number of different items: " + items.size(), 100, 100 + 20 * (list.size() + 1));
    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if(command.equals("Add"))
        {
            String name = JOptionPane.showInputDialog("Enter the name of the item");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Enter the price of the item"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of the item"));
            Item item = new Item(price, name, quantity);
            items.add(item);
        }
        else if(command.equals("Remove"))
        {
            String name = JOptionPane.showInputDialog("Enter the name of the item");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Enter the price of the item"));
            Item item = new Item(price, name, 1);
            items.remove(item);
        }
        else if(command.equals("Clear"))
        {
            items.clear();
        }
        repaint();
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }
    




}
