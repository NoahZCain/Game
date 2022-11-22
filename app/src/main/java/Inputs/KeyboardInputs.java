package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    /**
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
                System.out.println("Its W");
            break;
            case KeyEvent.VK_A:
                System.out.println("Its A");
            break;
            case KeyEvent.VK_S:
                System.out.println("its S");
            break;
            case KeyEvent.VK_D:
                System.out.println("its D");
            break;
        }
    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
