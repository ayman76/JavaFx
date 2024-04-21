package com.example;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label myLabel;

    @FXML
    private DatePicker myDatePicker;

    public void selectDate(ActionEvent event){
        LocalDate date = myDatePicker.getValue();
        String myFormattedDate = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        myLabel.setText(myFormattedDate);
    }
}
