package BKsoft;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public Main() throws HeadlessException{
        this("untitled");
    }
    public Main(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JPanel contentPanel = new JPanel();

        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        Panel panel = new Panel();
        contentPanel.add(panel);
    }
}
