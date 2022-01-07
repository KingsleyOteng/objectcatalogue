/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import database_builder.Build_database;

/**
 *
 * @author kwadwooteng-amoako
 * @date january 6th 2022
 */
public class Database_builder extends Application {
    
  
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        final MenuButton menuButton = new MenuButton("Plain Button", null, new MenuItem("Item 1"), new MenuItem("Item 2"));
        
        Build_database nb = new Build_database();
        
        //System.out.println(nb.string_out());
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
