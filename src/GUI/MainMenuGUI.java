package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainMenuGUI extends GUI {

    GridPane gridPane = new GridPane();

    Button createAccount = new Button("Create Account");
    Button searchItems = new Button("Search Items");

    public MainMenuGUI(){
        super();
        pageTitle = "Menu";
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(createAccount,0,0);
        gridPane.add(searchItems,1,0);

        scene = new Scene(gridPane,300,300);

        createAccount.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
//                    primaryStageRef.close();
                    primaryStageRef.close();
                    new CreateUserStage().start(new Stage());

                    }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        searchItems.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
//                    primaryStageRef.close();
                    new CreateUserStage().start(new Stage());

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
