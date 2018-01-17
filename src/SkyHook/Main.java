package SkyHook;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application  {

    Button btn;

    public static void main(String[] args) {
        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Title of the Window");

        btn = new Button();
        btn.setText("ClickMe");



        // Anonymous class
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You click again");
            }
        });

        // Lambda expression
        btn.setOnAction(e -> {
            System.out.println("Clicked ");
        });


        StackPane layout = new StackPane();
        layout.getChildren().add(btn);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();



    }


}
