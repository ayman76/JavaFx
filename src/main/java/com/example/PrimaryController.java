package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class PrimaryController {

    @FXML
    private Label myLabel;

    @FXML
    private RadioButton pizzaRadio, sushiRadio, ramenRadio;

    public void getFood(ActionEvent exActionEvent){
        if(pizzaRadio.isSelected()){
            myLabel.setText(pizzaRadio.getText());
        }else if(sushiRadio.isSelected()){
            myLabel.setText(sushiRadio.getText());
        }else if(ramenRadio.isSelected()){
            myLabel.setText(ramenRadio.getText());
        }
    }
}
