import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame interfata = new JFrame("Sign in");
        interfata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfata.setSize(600, 300);
        JPanel bigPanel = new JPanel();
        bigPanel.setLayout(new BoxLayout(bigPanel, BoxLayout.Y_AXIS));

        JPanel usernamePanel = new JPanel();
        JPanel passwordPanel = new JPanel();
        JPanel termsPanel = new JPanel();
        JButton logIn = new JButton("Log in");
        JPanel succes = new JPanel();

        JLabel usernameLabel = new JLabel("username");
        JTextField usernameText = new JTextField();
        JLabel passwordLabel = new JLabel("password");
        JPasswordField passwordText = new JPasswordField();
        JLabel termsLabel = new JLabel("Terms and conditions");
        JCheckBox checkBox = new JCheckBox();
        JLabel succesLabel = new JLabel("Not logged in");

        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usernameText.getText().equals("123"))
                    succesLabel.setText("Logged in");
            }
        });

        usernameText.setColumns(30);
        passwordText.setColumns(30);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameText);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordText);
        termsPanel.add(checkBox);
        termsPanel.add(termsLabel);
        succes.add(succesLabel);

        bigPanel.add(usernamePanel);
        bigPanel.add(passwordPanel);
        bigPanel.add(termsPanel);
        bigPanel.add(logIn);
        bigPanel.add(succes);

        interfata.add(bigPanel);
        interfata.setVisible(true);
    }
//    class logInListemer implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
}