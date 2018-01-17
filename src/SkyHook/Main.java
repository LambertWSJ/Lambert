package SkyHook;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// import components
import Components.*;


public class Main extends Application  {

    Stage window;
    Scene scene1,scene2;
    Button button;

    public static void main(String[] args) {
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("JavaFx");

        button = new Button("Click Me");


        button.setOnAction(event -> {
            // use a variable to store data
            boolean result = ConfirmationBox.display("Title of Window","Are you sure you want to send naked pics?");
            System.out.println(result);

        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,500,600);
        window.setScene(scene);
        window.show();



    }


}
