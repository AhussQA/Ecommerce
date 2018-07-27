package GUI;

import Database.Connection;
import Database.DatabaseFunctions;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemSearchGUI extends GUI {

    StackPane stackPane = new StackPane();
    VBox vboxLabels = new VBox();
    Button searchButton = new Button("Search");
    TextArea text = new TextArea();

    public ItemSearchGUI(){
        stackPane.setAlignment(Pos.CENTER);
        stackPane.getChildren().add(vboxLabels);
        stackPane.getChildren().add(searchButton);
        vboxLabels.getChildren().add(text);

        scene = new Scene(stackPane,300,300);
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Connection connection = new Connection();
                java.sql.Connection databaseConnection = Connection.getDatabaseConnection();
                ResultSet rs;
                Statement stmt;
                try {
                    stmt = databaseConnection.createStatement();
                    rs=stmt.executeQuery(DatabaseFunctions.listItems());
                    String output="";
                    while (rs.next()){
                        output+= rs.getString(1)+"\n";
                    }
                    text.setText(output);

                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        gui = new ItemSearchGUI();
        super.start(primaryStage);

    }
}
