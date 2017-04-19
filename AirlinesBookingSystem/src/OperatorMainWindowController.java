/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class OperatorMainWindowController implements Initializable {

    @FXML
    private JFXButton ChangePasswordButton;
    @FXML
    private JFXButton LogOutButton;
    @FXML
    private JFXButton UpdateFlightButton;
    @FXML
    private JFXButton DetailpassengerButton;
    @FXML
    private Text UsernameText;
    @FXML
    private JFXDatePicker PickDate1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
