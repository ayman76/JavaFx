package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondaryController {

    @FXML
    Label nameLabel;

    public void displayName(String name) {
        nameLabel.setText("Hello: " + name);
    }

}