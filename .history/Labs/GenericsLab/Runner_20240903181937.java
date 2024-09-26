
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

// just runs the screen class
public class Runner extends JFrame
{
    public static void main(String[] args)
    {
        Screen screen = new Screen();
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setSize(400, 400);
        
    }
}
