package ru.isu.yashkin.myapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class AdminController {



    @FXML
    void buttonReport(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/report.fxml"));
        stage.setTitle("Отчеты");
        stage.setScene(new Scene(root, 600, 375));
        stage.show();
    }

    @FXML
    void buttonProduct(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/product.fxml"));
        stage.setTitle("Товары");
        stage.setScene(new Scene(root, 600, 375));
        stage.show();
    }

    @FXML
    void buttonCustomer(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/customer.fxml"));
        stage.setTitle("Клиенты");
        stage.setScene(new Scene(root, 600, 375));
        stage.show();
    }


}
