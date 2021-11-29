package BKsoft;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() throws HeadlessException {
        this("untitled");
    }
    public Window(String title) throws HeadlessException {
        super(title);
        build();
    }

    public void build(){
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
        loginContainer.setBounds(50,50,300,25);

        JLabel loginTextLabel = new JLabel("login");
        loginTextLabel.setBounds(0,0,75,25);
        loginContainer.add(loginTextLabel);

        JTextField loginTextField = new JTextField();
        loginTextField.setBounds(75,0,175,25);
        loginContainer.add(loginTextField);

        contentPanel.add(loginContainer);

        //przycisk do login:
        JButton loginButton = new JButton("login");
        loginButton.setBounds(200, 200, 100, 25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //tutaj se wklep funkcję
            }
        });
        contentPanel.add(loginButton);

        //password container:
        JPanel passwordContainer = new JPanel();
        passwordContainer.setLayout(null);
        passwordContainer.setBounds(50,100,300,25);

        JLabel passwordTextLabel=new JLabel("Password");
        passwordTextLabel.setBounds(0,0,75,25);
        passwordContainer.add(passwordTextLabel);

        JPasswordField passwordTextField=new JPasswordField();
        passwordTextField.setBounds(75,0,175,25);
        passwordContainer.add(passwordTextField);

        contentPanel.add(passwordContainer);
    }
}
