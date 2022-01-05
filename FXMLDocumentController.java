/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_builder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

/**
 *
 * @author kwadwooteng-amoko
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private MenuButton menuButton1 = new MenuButton("Cities");
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      label.setText("Hello World!");
      menuButton1.setText("Hello World!");

    }    
    
}
