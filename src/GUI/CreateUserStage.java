package GUI;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateUserStage extends GUI {


    StackPane stackPane = new StackPane();
    VBox vboxLabels = new VBox();
    VBox vboxTextFields = new VBox();
    HBox container = new HBox();

    private Label userLabel = new Label("Username: ");
    private Label passwordLabel = new Label("Password: ");
    private Label confirmPasswordLabel = new Label("Confirm Password: ");

    private TextField userInput = new TextField();
    private TextField passwordInput = new TextField();
    private TextField confirmPasswordInput = new TextField();



    public CreateUserStage(){

        pageTitle = "Create User Account";

        stackPane.setAlignment(Pos.CENTER);
        stackPane.getChildren().add(container);
        container.getChildren().add(vboxLabels);
        container.getChildren().add(vboxTextFields);

        vboxLabels.getChildren().add(userLabel);
        vboxLabels.getChildren().add(passwordLabel);
        vboxLabels.getChildren().add(confirmPasswordLabel);

        vboxTextFields.getChildren().add(userInput);
        vboxTextFields.getChildren().add(passwordInput);
        vboxTextFields.getChildren().add(confirmPasswordInput);

        scene = new Scene(stackPane,300,300);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        gui = new CreateUserStage();
        super.start(primaryStage);

    }
}
