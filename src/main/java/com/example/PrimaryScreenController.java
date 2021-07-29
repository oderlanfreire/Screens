package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PrimaryScreenController {

    @FXML
    void switchToSecondaryScreen(ActionEvent event) throws IOException {
        App.setRoot("SecondaryScreen");
    }

}
