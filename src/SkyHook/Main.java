package SkyHook;

import Components.ConfirmationBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// import components


public class Main extends Application  {

    Stage window;
    Scene scene1,scene2;
    Button button;

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception{


        // 水平清單
        HBox top_menu = new HBox();
        Button file_button = new Button("File");
        Button edit_button = new Button("Edit");
        Button view_button = new Button("View");
        top_menu.getChildren().addAll(file_button,edit_button,view_button);

        // 垂直清單
        VBox left_menu = new VBox();
        Button btnD = new Button("D");
        Button btnE = new Button("E");
        Button btnF = new Button("F");
        left_menu.getChildren().addAll(btnD,btnE,btnF);


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(top_menu);
        borderPane.setLeft(left_menu);

        Scene scene = new Scene(borderPane,450,500);


        window = primaryStage;
        window.setTitle("SkyHook");
        window.setScene(scene);
        window.show();


    }



}
