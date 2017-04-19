/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class PassengerDetailWindowController implements Initializable {

    @FXML
    private TableView<?> PassengersTable;
    @FXML
    private TableColumn<?, ?> FirstNameColumn;
    @FXML
    private TableColumn<?, ?> LastNameColumn;
    @FXML
    private TableColumn<?, ?> FlightIDColumn;
    @FXML
    private TableColumn<?, ?> DateColumn;
    @FXML
    private TableColumn<?, ?> FareColumn;
    @FXML
    private JFXButton BackButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
