package main.java.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.java.App;

public class mainController {

    @FXML private Button btn_clientes;
    @FXML private Button btn_productos;
    @FXML private Button btn_comprar;

    @FXML
    void onClick(ActionEvent event) {
        try {
            App.setRoot("primary");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
