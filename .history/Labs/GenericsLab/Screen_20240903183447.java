import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener
{
    private ArrayList<Student> students;
    private ArrayList<JButton> buttons;
    private JButton add_new_student;

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

        add_new_student = new JButton("Add new student");
        add_new_student.setBounds(10, 10, 150, 25);
        add_new_student.addActionListener(this);
        this.add(add_new_student);
        


        for (int i = 0; i < students.size(); i++)
        {
            JButton button = new JButton("Show student info");
            button.setBounds(10, 10 + 30 * i, 400, 100);
            button.addActionListener(this);
            this.add(button);
        }
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (int i = 0; i < students.size(); i++)
        {
            g.drawString(students.get(i).getName(), 200, 30 * i + 30);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}