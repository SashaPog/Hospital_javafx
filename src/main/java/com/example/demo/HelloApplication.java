package com.example.demo;

import com.example.demo.collection.CollectionDoctorBook;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        test();
    }

    public void test(){
        CollectionDoctorBook collectionDoctorBook = new CollectionDoctorBook();
        collectionDoctorBook.fillTestData();
        collectionDoctorBook.print();
    }

    public static void main(String[] args) {
        launch();
    }
}