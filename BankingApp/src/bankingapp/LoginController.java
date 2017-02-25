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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Suraj
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    @FXML
    TextField username;
    @FXML
    PasswordField password;
   
    
    private final String Username = "admin";
    private final String Password = "password";
   
    @FXML
    private void handleButtonBack(ActionEvent event) {
        
        try {
            if (username.getText().equals("admin") || password.getText().equals("password")) {
            Node node = (Node)event.getSource();
           Stage stage = (Stage) node.getScene().getWindow();
           
           FXMLLoader loader = new FXMLLoader (getClass().getResource("FXMLDocument.fxml"));
           Parent root = loader.load();
           
           Scene scene = new Scene(root);
           stage.setScene(scene);
           stage.show();
           
        }
        }
        catch (Exception ex){
            
            System.out.println("Error hero ");
            
        }
       }
}
