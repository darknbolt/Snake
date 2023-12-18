import javax.swing.*;
import java.awt.*;

public class frame {
    public static void setFrame(JFrame mainFrame, JPanel mainPanel){
        mainFrame.setSize(1000, 1000);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setVisible(true);
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel);
        mainPanel.setBackground(Color.black);
    }
}
