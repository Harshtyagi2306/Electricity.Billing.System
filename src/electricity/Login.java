package electricity;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JTextField userText,passwordText;
    Choice loginChoice;
    JButton loginButton,cancelButton,signupButton;

    Login(){
        super("Login");
        getContentPane().setBackground(Color.GRAY);

        JLabel username = new JLabel("UserName");
        username.setBounds(300,60,100,20);
        add(username);

        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);

        JLabel password = new JLabel("Password");
        password.setBounds(300,100,100,20);
        add(password);

        passwordText = new JTextField();
        passwordText.setBounds(400,100,150,20);
        add(passwordText);

        JLabel login = new JLabel("Login in As");
        login.setBounds(300,140,100,20);
        add(login);

        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400,140,150,20);
        add(loginChoice);

        loginButton = new JButton("login");
        loginButton.setBounds(330,180,100,20);
        add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(460,180,100,20);
        add(cancelButton);

        signupButton = new JButton("Signup");
        signupButton.setBounds(400,215,100,20);
        add(signupButton);

        ImageIcon profileOne = new ImageIcon(ClassLoader.getSystemResource("icon.splash/profile.png"));
        Image profileTwo = profileOne.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon fprofileOne = new ImageIcon(profileTwo);
        JLabel profileLable = new JLabel(fprofileOne);
        profileLable.setBounds(5,5,250,250);
        add(profileLable);


        setSize(640,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Login();

    }
}
