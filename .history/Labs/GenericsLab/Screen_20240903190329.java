import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener
{
    private ArrayList<Student> students;
    private ArrayList<JButton> buttons;
    private JButton add_new_student;
    private boolean students_visible = true;
    private int cur_index_showing = 0;
    private boolean adding_student = false;
    private JButton back_button = new JButton("Back");
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

        back_button.setBounds(10, 10, 150, 25);
        
        back_button.addActionListener(this);
        back_button.setVisible(false);
        
        add_new_student.setFont(new Font("Arial", Font.BOLD, 15));


        buttons = new ArrayList<JButton>();
        


        for (int i = 0; i < students.size(); i++)
        {
            JButton button = new JButton("Show student info");
            button.setBounds(50, 50 + i * 50, 180, 50);
            button.addActionListener(this);
            button.setFont(new Font("Arial", Font.BOLD, 15));
            this.add(button);
            buttons.add(button);
        }
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(800, 600);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (students_visible)
        {
            for (int i = 0; i < students.size(); i++)
            {
                g.setFont(new Font("Arial", Font.BOLD, 15));
                g.drawString(students.get(i).getName(), 250, 50 * i + 75);
            }
        }
        else if (adding_student)
        {

        }
        else
        {
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString(students.get(cur_index_showing).getName(), 250, 50);
            ArrayList<Pair<Integer, String>> schedule = students.get(cur_index_showing).getSchedule();
            for (int i = 0; i < schedule.size(); i++)
            {
                g.setFont(new Font("Arial", Font.BOLD, 15));
                g.drawString(schedule.get(i).getFirst() + " : " + schedule.get(i).getSecond(), 250, 50 * i + 75);
            }
        }
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add_new_student)
        {
            if (students.size() > 10)
            {
                System.out.println("Too many students");
                return;
            }
            students.add(new Student("New Student"));
            JButton button = new JButton("Show student info");
            button.setBounds(50, 50 + (students.size() - 1) * 50, 180, 50);
            button.addActionListener(this);
            button.setFont(new Font("Arial", Font.BOLD, 15));
            this.add(button);
            buttons.add(button);
            adding_student = true;
            students_visible = false;
            back_button.setVisible(true);
            repaint();
        }
        else if (e.getSource() == back_button)
        {
            students_visible = true;
            adding_student = false;
            back_button.setVisible(false);
        }
        {
            for (int i = 0; i < buttons.size(); i++)
            {
                if (e.getSource() == buttons.get(i))
                {
                    cur_index_showing = i;
                    students_visible = false;
                    adding_student = false;
                    break;
                }
            }
            for (int i = 0; i < buttons.size(); i++)
            {
                buttons.get(i).setVisible(false);
            }
            back_button.setVisible(true);
            add_new_student.setVisible(false);
        }
    }
    
}