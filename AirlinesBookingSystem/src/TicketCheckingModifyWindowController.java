/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class TicketCheckingModifyWindowController implements Initializable {

    @FXML
    private JFXTextField FromTextField;
    @FXML
    private JFXTextField ToTextField;
    @FXML
    private JFXDatePicker DateTextField;
    @FXML
    private JFXSlider PassengerSlider;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
