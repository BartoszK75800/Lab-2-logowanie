package BKsoft;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;


public class Main extends JFrame{

    public static void main(String[] args) throws FileNotFoundException {
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
