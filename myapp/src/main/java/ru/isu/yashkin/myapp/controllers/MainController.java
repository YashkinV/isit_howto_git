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


public class MainController {

    @FXML
    private Label label;
        {
    }

    @FXML
    private TextField login;
    {

    }
    @FXML
    private TextField pass;
    {

    }

    @FXML
    void buttonClick(ActionEvent event) throws IOException {
       String l= login.getText(), p= pass.getText();
        Stage stage = new Stage();
        if (l.equals("admin")&&p.equals("")) {
            label.setText("Вы зашли как директор");
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/admin.fxml"));
            stage.setTitle("Директор:");
            stage.setScene(new Scene(root, 600, 375));
            stage.show();

        }
        else {label.setText("Ошибка авторизации");}
    }



}
