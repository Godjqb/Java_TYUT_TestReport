import Common.MouseEventMe;

import javax.swing.*;

/**
 * Created by godjqb on 17-1-7.
 */
public class Ex6_1_MouseEvent {
    public static void main(String args[]) {
        JFrame frm = new JFrame("MouseStatus");
        frm.setLayout(null);

        JTextField text = new JTextField(30);
        text.setBounds(20,10,260,30);
        frm.getContentPane().add(text);

        MouseEventMe mouse = new MouseEventMe(text);
        frm.addMouseListener(mouse);
        frm.addMouseMotionListener(mouse);

        frm.setBounds(500,250,300,200);
        frm.setVisible(true);

    }
}
