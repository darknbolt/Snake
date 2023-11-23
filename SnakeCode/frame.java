package SnakeCode;

import javax.swing.*;
import java.awt.*;

public class frame {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    public static void setFrame(JFrame mainFrame, JPanel mainPanel){
        mainFrame.setSize(1000, 1000);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel.setLayout(null);
        mainFrame.add(mainPanel);
    }
}
