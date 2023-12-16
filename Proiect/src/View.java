import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends Component {
    private Model viewModel;
    JFrame frame = new JFrame("Sudoku");
    JPanel table = new JPanel();
    JPanel commands = new JPanel();
    JPanel background = new JPanel();
    JTextField[][] smallBoxes = new JTextField[9][9];
    JPanel[] bigBoxes = new JPanel[9];
    JPanel[] lines = new JPanel[3];
    JButton check = new JButton("Check");
    JButton resume = new JButton("Resume");
    JButton generate = new JButton("Generate");
    JButton solve = new JButton("Solve");
    JButton restart = new JButton("Restart");
    Dimension size = new Dimension(80, 80);
    Font font = new JTextField().getFont();
    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
    private int redValue = 31;
    private int greenValue = 178;
    private int blueValue = 33;
    Color darkGreen = new Color(redValue, greenValue, blueValue);
    View(Model model){
        viewModel = model;
        viewModel.startGame();
        int idx = 0;
        for (int rows = 0; rows < 9; rows += 3) {
            for (int cols = 0; cols < 9; cols += 3) {
                bigBoxes[idx] = new JPanel(new GridLayout(3, 3));
                for (int i = rows; i < rows + 3; i++) {
                    for (int j = cols; j < cols + 3; j++) {
                        smallBoxes[i][j] = new JTextField();
                        smallBoxes[i][j].setPreferredSize(size);
                        smallBoxes[i][j].setFont(new Font(font.getName(), font.getStyle(), 30));
                        smallBoxes[i][j].setHorizontalAlignment(JTextField.CENTER);
                        smallBoxes[i][j].setBorder(border);
                        bigBoxes[idx].add(smallBoxes[i][j]);
                    }
                }
                idx ++;
            }
        }
        table.setLayout(new BoxLayout(table, BoxLayout.Y_AXIS));
        for (int i = 0; i < 3; i++) {
            lines[i] = new JPanel();
            lines[i].setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
            for (int j = 0; j < 3; j++) {
                lines[i].add(bigBoxes[i * 3 + j], BorderLayout.CENTER);
            }
            table.add(lines[i]);
        }
        commands.setLayout(new BoxLayout(commands, BoxLayout.Y_AXIS));
        check.setContentAreaFilled(false);
        resume.setContentAreaFilled(false);
        generate.setContentAreaFilled(false);
        solve.setContentAreaFilled(false);
        restart.setContentAreaFilled(false);
        commands.add(check);
        commands.add(resume);
        commands.add(generate);
        commands.add(solve);
        commands.add(restart);
        background.add(table);
        background.add(commands);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.add(background);
        frame.setVisible(true);

        generate();
    }
    void addCheckListener(ActionListener mal){
        check.addActionListener(mal);
    }
    void addResumeListener(ActionListener mal){
        resume.addActionListener(mal);
    }
    void addGenerateListener(ActionListener mal){
        generate.addActionListener(mal);
    }
    void addSolveListener(ActionListener mal){
        solve.addActionListener(mal);
    }
    void addRestartListener(ActionListener mal){
        restart.addActionListener(mal);
    }
    void check(){
        int rows = 0;
        int cols = 0;
        int ended = 1;
        int[][] checkMatrix = new int[9][9];
        while(rows < 9){
            int value = viewModel.getCurrentTableValue(rows, cols);
            if(value != 0){
                if(value < 1 || value > 9){
                    checkMatrix[rows][cols] = 1;
                    ended = 0;
                }
                for (int i = rows + 1; i < 9; i++) {
                    if(value == viewModel.getCurrentTableValue(i, cols)){
                        checkMatrix[rows][cols] = 1;
                        checkMatrix[i][cols] = 1;
                        ended = 0;
                    }
                }
                for (int i = cols + 1; i < 9; i++) {
                    if(value == viewModel.getCurrentTableValue(rows, i)){
                        checkMatrix[rows][cols] = 1;
                        checkMatrix[rows][i] = 1;
                        ended = 0;
                    }
                }
                int x = rows - rows % 3;
                int y = cols - cols % 3;
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        if(value == viewModel.getCurrentTableValue(i, j) && (i != rows || j != cols)){
                            checkMatrix[rows][cols] = 1;
                            checkMatrix[i][j] = 1;
                            ended = 0;
                        }
                    }
                }
            }
            else
                ended = 0;
            if(cols == 8){
                    cols = 0;
                    rows ++;
                }
                else{
                    cols ++;
                }
        }
        if(ended == 1){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if(viewModel.getInitialTableValue(i, j) != 0)
                        smallBoxes[i][j].setBackground(darkGreen);
                    else
                        smallBoxes[i][j].setBackground(Color.GREEN);
                }
            }
        }
        else{
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if(checkMatrix[i][j] == 1)
                        smallBoxes[i][j].setBackground(Color.RED);
                }
            }
        }
    }
    void generate() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = viewModel.getCurrentTableValue(i, j);
                if(value != 0){
                    smallBoxes[i][j].setText(Integer.toString(value));
                    smallBoxes[i][j].setEditable(false);
                    smallBoxes[i][j].setBackground(Color.lightGray);
                }
                else{
                    smallBoxes[i][j].setBackground(Color.WHITE);
                }
            }
        }
    }
    void solve(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = viewModel.getSolutionTableValue(i, j);
                smallBoxes[i][j].setText(Integer.toString(value));
                if(viewModel.getInitialTableValue(i, j) != 0)
                        smallBoxes[i][j].setBackground(darkGreen);
                    else
                        smallBoxes[i][j].setBackground(Color.GREEN);
            }
        }
    }
    void clearAllNumbers(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                smallBoxes[i][j].setEditable(true);
                smallBoxes[i][j].setText("");
            }
        }
    }
    void clearAllColor(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(viewModel.getInitialTableValue(i, j) != 0)
                    smallBoxes[i][j].setBackground(Color.LIGHT_GRAY);
                else
                    smallBoxes[i][j].setBackground(Color.WHITE);
            }
        }
    }
    void restart(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = viewModel.getCurrentTableValue(i, j);
                if(value == 0){
                    smallBoxes[i][j].setText("");
                    smallBoxes[i][j].setBackground(Color.WHITE);
                }
                else{
                    smallBoxes[i][j].setBackground(Color.lightGray);
                    smallBoxes[i][j].setEditable(false);
                }
            }
        }
    }
    String getUserInput(int i, int j){
        return smallBoxes[i][j].getText();
    }
    void setColor(int i, int j, Color color){
        smallBoxes[i][j].setBackground(color);
    }
}
