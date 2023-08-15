/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controller;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Juan
 */
public class Main extends Application {
    
    @Override
        public void start(Stage primaryStage){
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(Main.class.getResource("/view/operaciones.fxml"));
                Pane ventana = (Pane) loader.load();
                
                Scene scene = new Scene (ventana);
                primaryStage.setScene(scene);
                primaryStage.show();
                System.out.println("Corriendo con exito");
            }catch(IOException e){
                System.out.println(e.getMessage());
        }
    }
    
}
