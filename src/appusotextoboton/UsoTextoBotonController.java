/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import componentes_godoyjosecarlos.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Usuario
 */
public class UsoTextoBotonController implements Initializable {
    
   
    @FXML
    private CampoTextoBoton t1;
    @FXML
    private CampoTextoBoton t2;
    @FXML
    private Label l;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        t1.addEventHandler(EventType.ROOT, (Event eventHandler) -> {
            if(eventHandler.getEventType().getName().equalsIgnoreCase("Action"))
                l.setText("Se ha guardado "+t1.getText());
        });    
        
         t2.addEventHandler(EventType.ROOT, (Event eventHandler) -> {
            if(eventHandler.getEventType().getName().equalsIgnoreCase("Action"))
                l.setText("Se ha guardado "+t2.getText());
        }); 
    }
           
        
    
}
