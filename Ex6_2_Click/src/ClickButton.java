import javax.swing.*;
import java.awt.event.*;

/**
 * Created by godjqb on 17-1-8.
 */
public class ClickButton implements ActionListener {
    private JButton btn;
    private boolean state;

    public ClickButton(JButton btn, boolean state) {
        this.btn = btn;
        this.state = state;
    }

    public void actionPerformed(ActionEvent e) {
        this.state = !this.state;
        if (this.state) {
            this.btn.setText("Click Me");
        } else {
            this.btn.setText("Click Me Again");
        }
    }
}
