package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class PrimaryController implements Initializable{

    @FXML
    private Label myLabel;

    @FXML
    private Slider mySlider;

    private int myTemprature;
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        myTemprature = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(myTemprature) + "°C");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
               myTemprature = (int) mySlider.getValue();
               myLabel.setText(Integer.toString(myTemprature) + "°C");
            }
                
        });
    }

    
}
