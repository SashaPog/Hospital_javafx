package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PersonInfo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text profileName;

    @FXML
    private Text profileSurName;

    @FXML
    private Text profileEmail;

    @FXML
    private Button pageProfile;

    @FXML
    private Text profileDate;

    @FXML
    private Button pageDateAppointment;

    @FXML
    private Button pageDoctors;

    @FXML
    private Button pageDoctorAppointment;

    @FXML
    private Text pofilePhone;

    @FXML
    private Button pageExit;

    @FXML
    void ProfileButton(ActionEvent event) {

    }

    @FXML
    void AppointmentButton(ActionEvent event) {
        pageDoctorAppointment.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Doctor_appointment.fxml"));
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
    void DoctorsListButton(ActionEvent event) {
        pageDoctors.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Doctors_list.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root2));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void ExitButton(ActionEvent event) {
        pageExit.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root3 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root3));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }


    @FXML
    void initialize() {

    }
}
