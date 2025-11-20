//Jackson Webster
//11/20/2025
//Module 11 Assignment
//This program demonstrates how to organize a JavaFX user interface- 
//using a BorderPane layout with top, left, center, right, and bottom regions

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Top: toolbar
        HBox topBar = new HBox(8, new Button("New"), new Button("Open"), new Button("Save"));
        topBar.setPadding(new Insets(10));
        topBar.setAlignment(Pos.CENTER_LEFT);
        root.setTop(topBar);

        // Left: vertical navigation
        VBox leftNav = new VBox(10, new Button("Home"), new Button("Settings"), new Button("Help"));
        leftNav.setPadding(new Insets(10));
        root.setLeft(leftNav);

        // Center: main content
        Label centerLabel = new Label("Main content area (center). Resize the window to see how it fills space.");
        centerLabel.setPadding(new Insets(20));
        root.setCenter(centerLabel);

        // Right: quick actions
        VBox rightBox = new VBox(8, new Button("Action 1"), new Button("Action 2"));
        rightBox.setPadding(new Insets(10));
        root.setRight(rightBox);

        // Bottom: status / list
        ListView<String> status = new ListView<>();
        status.getItems().addAll("Ready", "Loaded resources", "Waiting for input");
        status.setMaxHeight(80);
        root.setBottom(status);

        Scene scene = new Scene(root, 640, 360);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
