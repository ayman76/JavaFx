package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML
    private AnchorPane myPane;

    @FXML
    private ColorPicker myColorPicker;

    public void changeColor(ActionEvent event){
        Color color = myColorPicker.getValue();
        myPane.setBackground(new Background(new BackgroundFill(color, null, null)));
    }
}
