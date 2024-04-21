package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController {

    @FXML
    private Label myLabel;

    @FXML
    private CheckBox myCheckBox;

    @FXML
    private ImageView myImageView;

    Image lampOff = new Image(getClass().getResourceAsStream("lampOFF.png"));
    Image lampOn = new Image(getClass().getResourceAsStream("lampON.png"));

    public void change(ActionEvent actionEvent){
        if(myCheckBox.isSelected()){
            myLabel.setText("ON");
            myImageView.setImage(lampOn);
        }else{
            myLabel.setText("OFF");
            myImageView.setImage(lampOff);
        }
    }
}
