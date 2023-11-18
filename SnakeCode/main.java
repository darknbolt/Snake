package SnakeCode;
import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        //Frame
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setResizable(false);
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBounds(0, 0, 1000, 1000);
        frame.add(panel);

        //Snake
        int x = 500; int y = 500;
        JPanel snake = new JPanel();
        snake.setBounds(x, y, 20, 20);
        panel.add(snake);



        frame.setVisible(true);
    }
}
