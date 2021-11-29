package BKsoft;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Window frame = new Window();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }


}
