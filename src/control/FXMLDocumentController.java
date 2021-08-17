/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import modelo.Numero;


/**
 *
 * @author elian.medina
 */
public class FXMLDocumentController implements Initializable {
    
    LinkedList<Numero> D;
 
    
    @FXML
    private void registroTotal(ActionEvent event){
        String mostrar ="";
        for (int i = 0; i < D.size(); i++) {
            Numero num = D.get(i);
            mostrar+= num.toString()+"\n";
            
        }
    }  
    @FXML
    private void registroIzq(ActionEvent event){
        
    }  
    @FXML
    private void registroDer(ActionEvent event){
        
    }  
    @FXML
    private void registroPar(ActionEvent event){
        
    }  
    @FXML
    private void botonProbabilidad(ActionEvent event){
        
    }  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        D = new LinkedList<>();

        

    }    
    
}
