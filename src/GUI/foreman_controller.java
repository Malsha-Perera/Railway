package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by USER on 8/20/2017.
 */
public class foreman_controller implements Initializable  {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



    public void pressButton(ActionEvent event) {
        System.out.println("Are you sure you want to log out?");
    }

    @FXML
    void methodCall(ActionEvent event) throws IOException{
        try {
            FXMLLoader Fx = new FXMLLoader();
            Parent root = Fx.load(getClass().getResource("engineFailure.fxml"));
            Stage primaryStage = new Stage();
            primaryStage.setTitle("Engine Failiure Management System - SLR");

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        catch(Exception e){
            System.out.println(e);

        }
    }

}