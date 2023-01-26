package com.example.demo;


import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Registration {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private RadioButton Authmale;

    @FXML
    private TextField authEmail;

    @FXML
    private RadioButton Authfemele;

    @FXML
    private TextField AuthLastName;

    @FXML
    private TextField AuthDate;

    @FXML
    private TextField AuthFirstName;

    @FXML
    private TextField AuthPassword;

    @FXML
    private Button applyButton;

    @FXML
    void btSignInButton(ActionEvent event) {
        applyButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    private ToggleGroup toggleGroup = new ToggleGroup();

    @FXML
    void initialize() {
        Authfemele.setToggleGroup(toggleGroup);
        Authmale.setToggleGroup(toggleGroup);


        applyButton.setOnMouseReleased(mouseEvent -> {
            String login = authEmail.getText();
            String firstName = AuthFirstName.getText();
            String lastName = AuthLastName.getText();
            String email = authEmail.getText();
            String password = AuthPassword.getText();
            User.Gender gender = Objects.equals(Authmale.isSelected(), Boolean.TRUE) ? User.Gender.MALE : User.Gender.FEMALE;

            User user = new User(login, firstName, lastName, email, password, gender);

            DataStorage.getInstance().getUsers().add(user);
        });

    }
}

