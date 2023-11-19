package SnakeCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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

        char direction = ' ';
        //Snake
        int x = 500;
        int y = 500;
        JPanel snake = new JPanel();
        snake.setBounds(x, y, 20, 20);
        panel.add(snake);


        snake.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                int test = snake.getX();
                if(key == KeyEvent.VK_LEFT){
                    snake.setAlignmentX(test--);
                }else if(e.getKeyChar() == 'd'){

                }else if(e.getKeyChar() == 's'){

                }else if(e.getKeyChar() == 'w'){

                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.setVisible(true);
    }
}
