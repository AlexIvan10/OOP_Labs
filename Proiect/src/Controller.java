import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model controllerModel;
    private View controllerView;
    Controller(Model model, View view){
        controllerModel = model;
        controllerView = view;

        view.addCheckListener(new CheckListener());
        view.addResumeListener(new ResumeListener());
        view.addGenerateListener(new GenerateListener());
        view.addSolveListener(new SolveListener());
        view.addRestartListener(new RestartListener());
    }
    class CheckListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String userInput;
            controllerView.clearAllColor();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    try {
                        userInput = controllerView.getUserInput(i, j);
                        if(userInput.isEmpty())
                            controllerView.setColor(i, j, Color.YELLOW);
                        else{
                            controllerModel.setRowsCols(Integer.valueOf(userInput), i, j);
                            if(Integer.valueOf(userInput) < 1 || Integer.valueOf(userInput) > 9)
                                controllerView.setColor(i, j, Color.RED);
                        }
                    } catch (NumberFormatException nfex) {
                        controllerView.setColor(i, j, Color.RED);
                    }
                }
            }
            controllerView.check();
        }
    }
    class ResumeListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            controllerView.clearAllColor();
        }
    }
    class GenerateListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            controllerModel.generate();
            controllerView.clearAllNumbers();
            controllerView.generate();;
        }
    }
    class SolveListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            controllerView.solve();
        }
    }
    class RestartListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            controllerModel.restart();
            controllerView.restart();
        }
    }
}
