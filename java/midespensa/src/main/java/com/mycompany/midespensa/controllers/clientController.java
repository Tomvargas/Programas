package main.java.controllers;

// REPOSITORIES
import main.java.repositories.ClientRepository;

// MODELS
import main.java.models.Clients;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class clientController implements Initializable {
    @FXML private TableView<Clients> tb_client;
    @FXML private TableColumn<Clients, String> col_idDoc;
    @FXML private TableColumn<Clients, String> col_A1;
    @FXML private TableColumn<Clients, String> col_A2;
    @FXML private TableColumn<Clients, String> col_nom;
    @FXML private TableColumn<Clients, String> col_dir;
    @FXML private TableColumn<Clients, String> col_telf;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Clients> data = FXCollections.observableArrayList(ClientRepository.getAll());

        col_idDoc.setCellValueFactory(new PropertyValueFactory<Clients, String>("id"));
        col_A1.setCellValueFactory(new PropertyValueFactory<Clients, String>("a1"));
        col_A2.setCellValueFactory(new PropertyValueFactory<Clients, String>("a2"));
        col_nom.setCellValueFactory(new PropertyValueFactory<Clients, String>("nom"));
        col_dir.setCellValueFactory(new PropertyValueFactory<Clients, String>("dir"));
        col_telf.setCellValueFactory(new PropertyValueFactory<Clients, String>("telf"));

        tb_client.setItems(data);
    }

}
