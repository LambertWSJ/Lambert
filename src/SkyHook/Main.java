package SkyHook;

import Components.ConfirmationBox;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Stack;


public class Main extends Application  {

    Stage window;
    Scene scene;
    Button button;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("SkyHook");

        button = new Button("Submit");

        String[] movie_list = {"Iron Man","Titanic","Super Man","Transformer"};

        TreeItem<String> root, bucky, megan;

        // root
        root = new TreeItem<>();
        root.setExpanded(true);

        // bucky
        bucky = makeBranch("Bucky",root);
        for (int i = 0; i < movie_list.length; i++) {
            makeBranch(movie_list[i],bucky);
        }

        // megan
        megan = makeBranch("Megan",root);
        makeBranch("Glitter",megan);
        makeBranch("Make up",megan);



        // tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty()
            .addListener((v,old_value,new_value) -> {
                if(new_value != null)
                    System.out.println(new_value.getValue());
            });


        // Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        // Scene
        scene = new Scene(layout,300,350);
        window.setScene(scene);
        window.show();
    }

    private TreeItem makeBranch(String title,TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);

        return item;

    }



}
