package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
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
        
        //Root node
        Group root = new Group();
        //Scene that show to user as a page
        Scene scene = new Scene(root, Color.BLACK);
        //Adding Icon to stage
        Image icon = new Image("home.png");
        stage.getIcons().add(icon);
        //Adding title to stage
        stage.setTitle("Stage 1");

        //Setting width and height for stage
        stage.setWidth(420);
        stage.setHeight(420);

<<<<<<< Updated upstream
        //Enable and Disable Resizable for stage
        // stage.setResizable(false);

        //Set X and Y axis for stage
        // stage.setX(50);
        // stage.setY(50);
=======
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(root, 600, 600);

            stage.setScene(scene);
            stage.setTitle("Using Scene Builder");
            stage.show();
>>>>>>> Stashed changes

        //Set Fullscreen, Fullscreen exit hint and Fullscreen exit key combination
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You Can't Escape unless you didn't press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); 

        // Stage stage = new Stage();
        //Stage is the window of the application
        stage.setScene(scene);
        stage.show();
    }

}