package game;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.imageio.stream.MemoryCacheImageOutputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float xDelta = 100;
    private float yDelta = 100;
    private int frames;
    private long lastCheck = 0;
    private float xDir = .005f;
    private float yDir = .005f;

    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value){
        this.xDelta += value;

    }
    public void changeYDelta(int value){
        this.yDelta += value;

    }
    public void setRectPos(int x, int y ){
        this.xDelta = x;
        this.yDelta = y;

    }



    public void paintComponent(Graphics g){
        super.paintComponent(g);

        updateRectangle();
        g.setColor(Color.blue);

        g.setColor(Color.red);

        g.fillRect( (int)xDelta,(int)yDelta,200,50);
        frames ++;
        if(System.currentTimeMillis() - lastCheck >= 1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS :" + frames);
            frames = 0;
        }
        repaint();

    }
    private void updateRectangle(){
        xDelta+= xDir;
        if(xDelta >400 || xDelta <0){
            xDir *= -1;
        }
        yDelta += yDir;
        if(yDelta > 400 || yDelta <0){
            yDir *= -1;
        }
    }
}
