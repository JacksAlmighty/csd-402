//Jackson Webster
//11/20/2025
//Module 11 Assignment
//This program demonstrates how to arrange JavaFX controls in a flexible row-and-column layout using a GridPane.

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(8);
        grid.setPadding(new Insets(12));

        // Row 0
        grid.add(new Label("First Name:"), 0, 0);
        grid.add(new TextField(), 1, 0);

        // Row 1
        grid.add(new Label("Last Name:"), 0, 1);
        grid.add(new TextField(), 1, 1);

        // Row 2
        grid.add(new Label("Email:"), 0, 2);
        grid.add(new TextField(), 1, 2);

        // Row 3: submit button spans two columns
        Button submit = new Button("Submit");
        grid.add(submit, 0, 3, 2, 1);

        Scene scene = new Scene(grid, 420, 220);
        primaryStage.setTitle("GridPane Example - Simple Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
