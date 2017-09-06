package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by acer on 8/21/2017.
 */
public class Loco_controller {
    public Button btn_Back;


    public void pressbtnBack(ActionEvent event) throws IOException {


        try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


