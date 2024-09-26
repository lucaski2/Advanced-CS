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
    private 

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
        ans.setText("");
        this.add(ans);

        equal = new JButton();
        equal.setFont(new Font("Arial", Font.BOLD, 20));
        equal.setHorizontalAlignment(SwingConstants.CENTER);
        equal.setBounds(322, 118, 40, 40);
        equal.setText("=");
        this.add(equal);
        equal.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == )
    }
    

}




