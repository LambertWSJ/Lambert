package SkyHook;

import Components.ConfirmationBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

// import components


public class Main extends Application  {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("SkyHook");




        button = new Button("Click Me");

        ChoiceBox<String> choiceBox = new ChoiceBox<String>();

        // getItems returns the observableList object which you add items to
        String[] fruits = {"Apple","Bananas","Papaya","PieApple"};
        choiceBox.getItems().addAll(fruits);

        // Listen for selection changes
        choiceBox.getSelectionModel()
                .selectedItemProperty()
                .addListener((e,oldValue,newValue)->{
                    System.out.println(newValue);
                });


        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);

        scene = new Scene(layout,300,350);
        window.setScene(scene);
        window.show();


    }



}
