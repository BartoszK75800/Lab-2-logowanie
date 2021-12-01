package BKsoft;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

public class Window extends JFrame {
    public Window() throws HeadlessException {
        this("untitled");
    }
    public Window(String title) throws HeadlessException {
        super(title);
        build();
    }

    public void build() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JPanel contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(2,2,2,2));

        setContentPane(contentPanel);
        contentPanel.setLayout(null);
        contentPanel.setBounds(0,0,400,300);

        //login container:
        JPanel loginContainer = new JPanel();
        loginContainer.setLayout(null);
        loginContainer.setBounds(50,50,250,25);

        JLabel loginTextLabel = new JLabel("login");
        loginTextLabel.setBounds(0,0,75,25);
        loginContainer.add(loginTextLabel);

        JTextField loginTextField = new JTextField();
        loginTextField.setBounds(75,0,175,25);
        loginContainer.add(loginTextField);

        contentPanel.add(loginContainer);

        //password container:
        JPanel passwordContainer = new JPanel();
        passwordContainer.setLayout(null);
        passwordContainer.setBounds(50,100,250,25);

        JLabel passwordTextLabel=new JLabel("Password");
        passwordTextLabel.setBounds(0,0,75,25);
        passwordContainer.add(passwordTextLabel);

        JPasswordField passwordTextField=new JPasswordField();
        passwordTextField.setBounds(75,0,175,25);
        passwordContainer.add(passwordTextField);

        contentPanel.add(passwordContainer);

        //przycisk do login:
        JButton loginButton = new JButton("login");
        loginButton.setBounds(200, 200, 100, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loginClicked(loginTextField.getText(), passwordTextField.getText(), contentPanel);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });
        contentPanel.add(loginButton);

        //menuBar:
        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu=new JMenu("Options");
        contentPanel.add(menu);

        JMenuItem loginMB=new JMenuItem("Login");
        loginMB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loginClicked(loginTextField.getText(), passwordTextField.getText(), contentPanel);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });
        menu.add(loginMB);
        menuBar.add(menu);
    }

    private void loginClicked(String login, String haslo, JPanel contentPanel) throws FileNotFoundException {
        Database database = new Database();
        database.loadDB();

        if(database.check(login, haslo)==true){
            contentPanel.setBackground(Color.GREEN);
        }
        else contentPanel.setBackground(Color.RED);
    }

}
