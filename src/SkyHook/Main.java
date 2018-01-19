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
        choiceBox.getItems().add("Apple");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().add("Papaya");
        choiceBox.getItems().add("PieApple");

//        其他寫法
//        choiceBox.getItems().addAll("Apple","Bananas","Papaya","PieApple");
//        String[] fruits = {"Apple","Bananas","Papaya","PieApple"};
//        choiceBox.getItems().addAll(fruits);

        // Set default value
        choiceBox.setValue("Apple");

        button.setOnAction(event -> {
            getChoice(choiceBox);
        });



        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);

        scene = new Scene(layout,300,350);
        window.setScene(scene);
        window.show();


    }

    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }


}
