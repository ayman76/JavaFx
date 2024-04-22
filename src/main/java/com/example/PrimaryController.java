package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PrimaryController implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoicebox;

    private String[] food = { "Pizza", "Sushi", "Ramen" };

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        myChoicebox.getItems().addAll(food);
        myChoicebox.setOnAction(this::getFood);
    }

    public void getFood(ActionEvent event){
        String selectedFood = myChoicebox.getValue();
        myLabel.setText(selectedFood);
    }

}
