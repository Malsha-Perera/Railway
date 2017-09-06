package Model;/**
 * Created by USER on 8/20/2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class foreman extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/foreman.fxml"));
        primaryStage.setTitle("Engine Failiure Management System - SLR");

        Scene scene =new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();





        }

    }

