package Common;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

/**
 * Created by godjqb on 17-1-7.
 */
public class MouseEventMe implements MouseListener, MouseMotionListener {
    private JTextField text;

    public MouseEventMe(JTextField text) {
        this.text = text;
    }

    public void mouseDragged(MouseEvent e) {
        String s = "mouseDragged: " + new Date(System.currentTimeMillis());
        text.setText(s);
    }

    public void mouseEntered(MouseEvent e) {
        String s = "mouseEntered: " + new Date(System.currentTimeMillis());
        text.setText(s);
    }

    public void mouseExited(MouseEvent e) {
        String s = "mouseExited: " + new Date(System.currentTimeMillis());
        text.setText(s);
    }

    public void mouseMoved(MouseEvent e) {
        String s = "mouseMoved: " + new Date(System.currentTimeMillis());
        text.setText(s);
    }

    public void mouseClicked(MouseEvent e) {
        String s = "Clicked: " + new Date(System.currentTimeMillis());
        text.setText(s);
    }

    public void mousePressed(MouseEvent e) {
        String s = "mousePressed: " + new Date(System.currentTimeMillis());
        text.setText(s);
    }

    public void mouseReleased(MouseEvent e) {
        String s = "mouseReleased: " + new Date(System.currentTimeMillis());
        text.setText(s);
    }

}
