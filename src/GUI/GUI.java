package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class GUI extends Application {
    static String pageTitle;
    Scene scene;
    Stage primaryStageRef;
    GUI gui;


    public GUI() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setScene(gui.getScene());
        primaryStage.setTitle(gui.getPageTitle());
        gui.setPrimaryStageRef(primaryStage);
        primaryStage.show();
    }

    public static String getPageTitle() {
        return pageTitle;
    }

    public Scene getScene() {
        return scene;
    }

    public Stage getPrimaryStageRef() {
        return primaryStageRef;
    }

    public void setPrimaryStageRef(Stage primaryStageRef) {
        this.primaryStageRef = primaryStageRef;
    }
}