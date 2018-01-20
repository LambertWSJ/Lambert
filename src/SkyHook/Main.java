package SkyHook;

import Components.ConfirmationBox;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Stack;


public class Main extends Application  {

    Stage window;
    Scene scene;
    Button button;
    TableView<Product> table;
    public static void main(String[] args) {
        launch(args);
    }





    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;
        window.setTitle("SkyHook");

        // Name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Price column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(200);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        // Quantity column
        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(200);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);



        // Layout
        VBox layout = new VBox();
        layout.getChildren().addAll(table);
        // Scene
        scene = new Scene(layout,600,350);
        window.setScene(scene);
        window.show();
    }

    // Get all of product
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop",500,20));
        products.add(new Product("Bouncy Ball",2500,50));
        products.add(new Product("Toilet",280,44));
        products.add(new Product("Corn",600,36));
        products.add(new Product("Movie Ticket",700,78));


        return products;
    }




}
