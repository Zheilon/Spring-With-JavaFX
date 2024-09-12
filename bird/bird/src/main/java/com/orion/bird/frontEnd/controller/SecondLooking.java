package com.orion.bird.frontEnd.controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class SecondLooking implements Initializable {

    @FXML
    private Label text;

    @FXML
    private Button button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        text.setText("Segundo Escena!");
    }
}