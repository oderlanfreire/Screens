package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SecondaryScreenController {

    @FXML
    void switchToTertiaryScreen(ActionEvent event) throws IOException {
        App.setRoot("tertiaryScreen");
    }
}
