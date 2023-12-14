import javax.swing.*;
import java.awt.*;

public class GenerateButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Create a 3x3 grid of JTextFields
        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
        JTextField[][] textFields = new JTextField[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                textFields[i][j] = new JTextField();
                textFields[i][j].setPreferredSize(new Dimension(50, 50)); // Set preferred size as needed
                gridPanel.add(textFields[i][j]);
            }
        }

        // Create a button
        JButton button = new JButton("Button");

        gbc.gridx = 1; // Place the grid at the center (x = 1)
        gbc.gridy = 1;
        mainPanel.add(gridPanel, gbc);

        gbc.gridx = 2; // Place the button at the top-right corner (x = 2, y = 0)
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST; // Align to the top-right
        mainPanel.add(button, gbc);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
