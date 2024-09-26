import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Screen extends JFrame implements ActionListener
{
    private ArrayList<Student> students;
    private JTextArea textArea;
    private JTextField nameField;
    private JTextField periodField;
    private JTextField classField;
    private JButton addButton;
    public Screen()
    {
        students = new ArrayList<Student>();
        textArea = new JTextArea();
        nameField = new JTextField();
        periodField = new JTextField();
        classField = new JTextField();
        addButton = new JButton("Add Class");
        addButton.addActionListener(this);
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(4, 2));
        southPanel.add(new JLabel("Name:"));
        southPanel.add(nameField);
        southPanel.add(new JLabel("Period:"));
        southPanel.add(periodField);
        southPanel.add(new JLabel("Class:"));
        southPanel.add(classField);
        southPanel.add(addButton);
        add(southPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == addButton)
        {
            String name = nameField.getText();
            int period = Integer.parseInt(periodField.getText());
            String className = classField.getText();
            boolean found = false;
            for (int i = 0; i < students.size(); i++)
            {
                if (students.get(i).getName().equals(name))
                {
                    students.get(i).addClass(period, className);
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                Student student = new Student(name);
                student.addClass(period, className);
                students.add(student);
            }
            updateTextArea();
        }
    }

    public void updateTextArea()
    {
        textArea.setText("");
        for (int i = 0; i < students.size(); i++)
        {
            textArea.append(students.get(i).toString() + '\n');
        }
    }
}