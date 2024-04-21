package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {

    // ImageView is a Node used for painting images loaded with Images

    // Image = picture
    // ImageView = picture frame

    @FXML

    ImageView myImageView;
    Button myButton;
    
    Image myImage = new Image(getClass().getResourceAsStream("heart.png"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }
}
