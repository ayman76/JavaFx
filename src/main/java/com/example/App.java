package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        try {

            Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
            Scene scene = new Scene(root, 400, 400);

            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.setTitle("Using Scene Builder");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}