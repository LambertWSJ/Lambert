package Components;
/*
* ConfirmationBox
* */

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmationBox {

    static boolean answer;

    public static boolean display(String title, String mesage){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label(mesage);


        Button yes_btn = new Button("Yes");
        Button no_btn = new Button("No");

        yes_btn.setOnAction(event -> {
            answer = true;
            window.close();
        });

        no_btn.setOnAction(event -> {
            answer = false;
            window.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(yes_btn,no_btn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,250,150);
        window.setScene(scene);
        window.showAndWait();

        return answer;

    }
}








