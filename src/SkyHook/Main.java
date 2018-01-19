package SkyHook;

import Components.ConfirmationBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
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

        window = primaryStage;
        window.setTitle("SkyHook");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);


        // name
        Label nameLabel = new Label("Username: ");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput, 1, 0);

        // password
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(nameLabel, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("password"); // just like placeholder
        GridPane.setConstraints(passInput, 1, 1);

        // login
        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);






        Scene scene = new Scene(grid,300,350);
        window.setScene(scene);
        window.show();


    }



}
