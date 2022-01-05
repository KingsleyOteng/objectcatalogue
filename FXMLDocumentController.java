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

/**
 *
 * @author kwadwooteng-amoko
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private MenuButton menuButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final ObservableList<CheckMenuItem> listFilter = FXCollections.observableArrayList();
        final  MenuButton menuButton = new MenuButton("Modalities");
        CheckMenuItem item1 = new CheckMenuItem("T1");
        CheckMenuItem item2 = new CheckMenuItem("T1C");
        CheckMenuItem item3 = new CheckMenuItem("T2");
        listFilter.addAll(item1, item2, item3);
        menuButton.getItems().addAll(listFilter);
        menuButton.setId("menuButton");
    }    
    
}
