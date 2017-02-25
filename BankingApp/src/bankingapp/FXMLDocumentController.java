/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Suraj
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonClickme(ActionEvent event) {
        try {
            Node node = (Node)event.getSource();
           Stage stage = (Stage) node.getScene().getWindow();
           
           FXMLLoader loader = new FXMLLoader (getClass().getResource("login.fxml"));
           Parent root = loader.load();
           
           Scene scene = new Scene(root);
           stage.setScene(scene);
           stage.show();
           
        }
        catch (Exception ex){
            System.out.println("Error hero ");
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
