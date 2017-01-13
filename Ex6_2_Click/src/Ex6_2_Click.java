import javax.swing.*;
import java.awt.*;

/**
 * Created by godjqb on 17-1-8.
 */
public class Ex6_2_Click
{
    public static void main(String args[]) {
        JFrame frm = new JFrame("ClikeButton");

        JButton btn = new JButton("Click Me");
        btn.addActionListener(new ClickButton(btn,true));

        frm.setLayout(new FlowLayout());
        frm.add(btn);
        frm.setSize(200,50);
        frm.setVisible(true);

    }
}
