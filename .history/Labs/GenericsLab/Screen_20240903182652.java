import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener
{
    private ArrayList<Student> students;
    private ArrayList<JButton> buttons;

    public Screen()
    {
        students = new ArrayList<Student>();
        setLayout(null);

        

    }
}