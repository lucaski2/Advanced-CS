import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener
{
    private ArrayList<Student> students;
    
    public Screen()
    {
        students = new ArrayList<Student>();
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        JButton addStudent = new JButton("Add Student");
        addStudent.addActionListener(this);
        topPanel.add(addStudent);
        add(topPanel, BorderLayout.NORTH);
    }
}