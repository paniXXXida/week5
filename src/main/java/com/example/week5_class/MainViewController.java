package com.example.week5_class;

import com.example.week5_class.data.Database;
import com.example.week5_class.model.Person;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    public Button add;
    @FXML
    public Button delete;
    private Database db;
    private ObservableList<Person> people;

    @FXML
    private TableView<Person> personTableView;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private DatePicker dob;

    @FXML
    private Label message;

    public MainViewController() {
        this.db = new Database();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        people = FXCollections.observableArrayList(db.getPeople());
        personTableView.setItems(people);
        personTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }
    public void onAddButtonClick(ActionEvent actionEvent) {
    }

    public void onDeleteButtonClick(ActionEvent actionEvent) {
    }


}
