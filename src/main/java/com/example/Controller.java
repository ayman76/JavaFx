package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    @FXML
    private Slider mySlider;

    

    @FXML
    public void up (ActionEvent event){
        // System.out.println("UP");
        myCircle.setCenterY(y-= mySlider.getValue());
    }
    @FXML
    public void down (ActionEvent event){
        // System.out.println("DOWN");
        myCircle.setCenterY(y+=mySlider.getValue());
    }
    @FXML
    public void left (ActionEvent event){
        // System.out.println("LEFT");
        myCircle.setCenterX(x-=mySlider.getValue());
    }
    @FXML
    public void right (ActionEvent event){
        // System.out.println("RIGHT");
        myCircle.setCenterX(x+=mySlider.getValue());
    }

    
}
