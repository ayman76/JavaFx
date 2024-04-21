package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

    @FXML
    private TextField myTextField;

    int age;

    public void submit(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());
            System.out.println(age);
            if(age >= 18) {
                myLabel.setText("You are signed up!");
            }else{
                myLabel.setText("You must be 18+");
            }
        } catch (NumberFormatException e) {
            myLabel.setText("Enter Numebrs only Please");
        }catch(Exception e){
            myLabel.setText("Error");   
        }
    }

}

