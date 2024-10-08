import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen extends JPanel implements ActionListener {
 
    private JButton clear;
    private JButton plus;
    private JButton sub;
    private JButton mul;
    private JButton div;
    private JTextField ans;
    private JButton equal;
    private double cur_num = 0;
    private String cur_action = "+";

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 250);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    public Screen() {

        clear = new JButton();
        clear.setFont(new Font("Arial", Font.BOLD, 20));
        clear.setHorizontalAlignment(SwingConstants.CENTER);
        clear.setBounds(38, 115, 40, 40);
        clear.setText("CE");
        this.add(clear);
        clear.addActionListener(this);

        plus = new JButton();
        plus.setFont(new Font("Arial", Font.BOLD, 20));
        plus.setHorizontalAlignment(SwingConstants.CENTER);
        plus.setBounds(94, 116, 40, 40);
        plus.setText("+");
        this.add(plus);
        plus.addActionListener(this);

        sub = new JButton();
        sub.setFont(new Font("Arial", Font.BOLD, 20));
        sub.setHorizontalAlignment(SwingConstants.CENTER);
        sub.setBounds(151, 116, 40, 40);
        sub.setText("-");
        this.add(sub);
        sub.addActionListener(this);

        mul = new JButton();
        mul.setFont(new Font("Arial", Font.BOLD, 20));
        mul.setHorizontalAlignment(SwingConstants.CENTER);
        mul.setBounds(207, 115, 40, 40);
        mul.setText("x");
        this.add(mul);
        mul.addActionListener(this);

        div = new JButton();
        div.setFont(new Font("Arial", Font.BOLD, 20));
        div.setHorizontalAlignment(SwingConstants.CENTER);
        div.setBounds(267, 116, 40, 40);
        div.setText("/");
        this.add(div);
        div.addActionListener(this);

        ans = new JTextField();
        ans.setFont(new Font("Arial", Font.PLAIN, 20));
        ans.setHorizontalAlignment(SwingConstants.LEFT);
        ans.setBounds(96, 56, 200, 30);
        ans.setText("Please enter a number");
        this.add(ans);

        equal = new JButton();
        equal.setFont(new Font("Arial", Font.BOLD, 20));
        equal.setHorizontalAlignment(SwingConstants.CENTER);
        equal.setBounds(322, 118, 40, 40);
        equal.setText("=");
        this.add(equal);
        equal.addActionListener(this);
    }

    public void eval(double num, String action)
    {
        if (action == "+")
        {
            cur_num += num;
        }
        else if (action == "-")
        {
            cur_num -= num;
        }
        else if (action == "x")
        {
            cur_num *= num;
        }
        else if (action == "/")
        {
            cur_num /= num;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus){
            if(ans.getText() != ""){
                eval(Double.parseDouble(ans.getText()), cur_action);
                cur_action = "+";
                ans.setText("");
            }
        } else if (e.getSource() == sub){
            if(ans.getText() != ""){
                eval(Double.parseDouble(ans.getText()), cur_action);
                cur_action = "-";
                ans.setText("");
            }
        } else if (e.getSource() == mul){
            if(ans.getText() != ""){
                eval(Double.parseDouble(ans.getText()), cur_action);
                cur_action = "x";
                ans.setText("");
            }
        } else if (e.getSource() == div){
            if(ans.getText() != ""){
                eval(Double.parseDouble(ans.getText()), cur_action);
                cur_action = "/";
                ans.setText("");
            }
        } else if (e.getSource() == clear){
            cur_num = 0;
            cur_action = "+";
            ans.setText("");
        } else if (e.getSource() == equal){
            if(ans.getText() != ""){
                eval(Double.parseDouble(ans.getText()), cur_action);
                ans.setText(Double.toString(cur_num));
                cur_num = 0;
                cur_action = "+";
            }
        }
    }
    

}




