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
        
        students.add(new Student("Alice"));
        students.get(0).addClass(1, "Math");
        students.get(0).addClass(2, "Science");
        students.get(0).addClass(3, "History");
        students.get(0).addClass(4, "English");
        students.add(new Student("Bob"));
        students.get(1).addClass(1, "Computer Science");
        students.get(1).addClass(2, "Art");
        students.get(1).addClass(3, "PE");
        students.get(1).addClass(4, "Spanish");
        students.add(new Student("Charlie"));
        students.get(2).addClass(1, "Math");
        students.get(2).addClass(2, "PE");
        students.get(2).addClass(3, "Computer Science");
        students.get(2).addClass(4, "French");

        for 
        

    }
}