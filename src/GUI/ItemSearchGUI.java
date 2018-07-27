package GUI;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ItemSearchGUI extends GUI {

    StackPane stackPane = new StackPane();
    VBox vboxLabels = new VBox();
    Button searchButton = new Button("Search");

    public ItemSearchGUI(){
        stackPane.setAlignment(Pos.CENTER);
        stackPane.getChildren().add(vboxLabels);
        stackPane.getChildren().add(searchButton);

        scene = new Scene(stackPane,300,300);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        gui = new ItemSearchGUI();
        super.start(primaryStage);

    }
}
