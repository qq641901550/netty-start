package com.netty.qqw.comtroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    int health = 100;
    @FXML private Button attack;
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        health = health - 1;
        attack.setText(String.valueOf(health));
    }
}
