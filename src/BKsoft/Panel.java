package BKsoft;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){
        setBorder(new LineBorder(new Color(149, 142, 142), 4, true));
        setBackground(Color.GRAY);
        setLayout(null);
    }
}
