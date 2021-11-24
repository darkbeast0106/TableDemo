package com.example.tabledemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private Label infoText;
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> firstNameCol;
    @FXML
    private TableColumn<Person, String> lastNameCol;

    @FXML
    public void initialize(){
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        Person p1 = new Person(1, "Teszt", "Elek");
        Person p2 = new Person(2, "Gipsz", "Jakab");
        Person p3 = new Person(3, "Lakatos", "Béla");
        personTable.getItems().add(p1);
        personTable.getItems().add(p2);
        personTable.getItems().add(p3);
    }

    @FXML
    protected void onHelloButtonClick() {
        if (personTable.getSelectionModel().getSelectedIndex() == -1){
            infoText.setText("Nincs kiválasztva személy");
        } else {
            infoText.setText(personTable.getSelectionModel().getSelectedItem().id+"");
        }
    }
}