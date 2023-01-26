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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button LoginSignInButton;

    @FXML
    private TextField LoginField;

    @FXML
    private Button authSignInButton;

    @FXML
    private PasswordField PasswordField;

    @FXML
    void LoginButton(ActionEvent event) {
    }


    @FXML
    void SignInButton(ActionEvent event) {
        authSignInButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registration.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void initialize() {
            LoginSignInButton.setOnMouseReleased(mouseEvent -> {
            String login = LoginField.getText();
            String password = PasswordField.getText();

            User user = DataStorage.getInstance().getUsers()
                    .stream()
                    .filter(listedUser -> Objects.equals(listedUser.getLogin(), login))
                    .findAny()
                    .orElseThrow(() -> {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText("User with Login: " + login + " doesn't exist");
                        alert.show();

                        throw new RuntimeException();
                    });

            if (!Objects.equals(user.getPassword(), password)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Wrong password");
                alert.show();

                throw new RuntimeException();
            }

            LoginSignInButton.getScene().getWindow().hide();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Person_Info.fxml"));
                Parent root1 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Вхід");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.out.println("Error");
            }
        });

    }

}

