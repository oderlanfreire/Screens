package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TertiaryScreenController {

    @FXML
    void switchToPrimaryScreen(ActionEvent event) throws IOException {
        App.setRoot("primaryScreen");
    }
}
