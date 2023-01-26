package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DoctorAppointment {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button pageProfile;

    @FXML
    private DatePicker chooseDate;

    @FXML
    private Button buttonSend;

    @FXML
    private ChoiceBox<?> chooseDoctor;

    @FXML
    private TextField describeSituation;

    @FXML
    private Button pageDateAppointment;

    @FXML
    private Button pageDoctors;

    @FXML
    private Button pageDoctorAppointment;

    @FXML
    private Button pageExit;

    @FXML
    private Button BView;

    @FXML
    void ChoiseDoctors(ActionEvent event) {

    }

    @FXML
    void DatePicker(ActionEvent event) {

    }

    @FXML
    void DescribeField(ActionEvent event) {

    }

    @FXML
    void SendButton(ActionEvent event) {

    }

    @FXML
    void BView(ActionEvent event) {

    }

    @FXML
    void ProfileButton(ActionEvent event) {
        pageProfile.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Person_Info.fxml"));
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
    void AppointmentButton(ActionEvent event) {

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

//    LocalDate selDate = chooseDate.getValue();

    @FXML
    void initialize() {


    }
}
