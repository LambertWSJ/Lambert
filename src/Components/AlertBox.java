package Components;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

/**
 * Created by styleine9527 on 2018/1/17.
 */
public class AlertBox {


    public static void display(String title, String mesage){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label(mesage);
        Button close_btn = new Button("Close the window");
        close_btn.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,close_btn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,250,150);
        window.setScene(scene);
        window.showAndWait();


    }
}







