package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.demo.collection.CollectionDoctorBook;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DoctorList {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Person, String> tableProfessions;

    @FXML
    private TableView<Person> tableDoctors;

    @FXML
    private Button pageProfile;

    @FXML
    private Button pageDateAppointment;

    @FXML
    private Button pageDoctors;

    @FXML
    private Button pageDoctorAppointment;

    @FXML
    private TableColumn<Person, String> tableHours;

    @FXML
    private Button pageExit;

    @FXML
    private TableColumn<Person, String> tableName;

    @FXML
    private Label LabelCount;

    private CollectionDoctorBook collectionDoctorBook = new CollectionDoctorBook();

    @FXML
    void initialize() {

        tableName.setCellValueFactory(new PropertyValueFactory<>( "pip"));
        tableProfessions.setCellValueFactory(new PropertyValueFactory<>( "Profetion"));
        tableHours.setCellValueFactory(new PropertyValueFactory<>( "Hours"));

        collectionDoctorBook.getPersonList().addListener(new ListChangeListener<Person>() {
            @Override
            public void onChanged(Change<? extends Person> change) {
                updateList();
            }
        });


        collectionDoctorBook.fillTestData();

        tableDoctors.setItems(collectionDoctorBook.getPersonList());

    }

    public void updateList(){
        LabelCount.setText("Кількість записів " + collectionDoctorBook.getPersonList().size());
    }

    public void ProfileButton(ActionEvent actionEvent) {
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

    public void AppointmentButton(ActionEvent actionEvent) {
        pageDoctorAppointment.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Doctor_appointment.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root2));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public void ExitButton(ActionEvent actionEvent) {
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
}

