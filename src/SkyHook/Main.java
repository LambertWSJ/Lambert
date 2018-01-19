package SkyHook;

import Components.ConfirmationBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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

        // 發出關閉事件的Request
        window.setOnCloseRequest(event -> {
            // 阻止Request事件傳播，以免選了NO還是繼續執行Request
            event.consume();

            // 詢問是否要關閉
            closeProgram();
        });

        button = new Button("Close program");
        button.setOnAction(event->{

            this.closeProgram();

        });



        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,450,450);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram(){
        Boolean answer = ConfirmationBox.display("Title","Sure you want to exit?");

        if(answer)
            window.close();

    }

}
