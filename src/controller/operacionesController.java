/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import Model.Operaciones;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Juan
 */
public class operacionesController implements Initializable {

    @FXML
    private Button btnSumar;
    @FXML
    private Button btnrestar;
    @FXML
    private Button btnProducto;
    @FXML
    private TextField txtNum2;
    @FXML
    private TextField resultado;
    @FXML
    private TextField txtNum1;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void click(ActionEvent event) {
        try {
            int numero1 = Integer.parseInt(this.txtNum1.getText());
            int numero2 = Integer.parseInt(this.txtNum2.getText());

            Operaciones sum = new Operaciones(numero1, numero2);

            int solucion = sum.sumarNumeros();
            this.resultado.setText(solucion + "");//con ese +"" convertimos el reultado a string
        } catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setContentText("Revisa si todo está bien en los campos de texto");
            alerta.showAndWait();
        }
    }

    @FXML
    void clickResta(ActionEvent event) {
        try {
            int numero1 = Integer.parseInt(txtNum1.getText());
            int numero2 = Integer.parseInt(txtNum2.getText());

            Operaciones resta = new Operaciones(numero1, numero2);
            int solucion = resta.restarNumeros();
            this.resultado.setText(solucion + "");
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setContentText("Revisa si todo está bien en los campos de texto");
            alerta.showAndWait();
        }
    }

    @FXML
    void clickProducto(ActionEvent event) {
        try {
            int numero1 = Integer.parseInt(txtNum1.getText());
            int numero2 = Integer.parseInt(txtNum2.getText());

            Operaciones producto = new Operaciones(numero1, numero2);
            int solucion = producto.productoNumeros();
            this.resultado.setText(solucion + "");
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setContentText("Revisa si todo está bien en los campos de texto");
            alerta.showAndWait();
        }
    }

}

