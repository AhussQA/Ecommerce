import GUI.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
            launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GUI userStage = new MainMenuGUI();
        primaryStage.setScene(userStage.getScene());
        primaryStage.setTitle(userStage.getPageTitle());
        userStage.setPrimaryStageRef(primaryStage);
        primaryStage.show();
    }
}
