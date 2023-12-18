package SnakeCode;
import javax.swing.*;

public class GameOBJ {
    private int dx;
    private int dy;
    private int size;
    public GameOBJ(int x, int y, int tempSize){
        int dx = x;
        int dy = y;
        size = (int)(Math.pow(tempSize, 2));
    }

}
