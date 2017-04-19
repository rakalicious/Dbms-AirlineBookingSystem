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
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class Cancel_Ticket_WindowController implements Initializable {

    @FXML
    private JFXButton Home_Botton;
    @FXML
    private TableView<?> CancelTicketTable;
    @FXML
    private TableColumn<?, ?> PNRColumn;
    @FXML
    private TableColumn<?, ?> DateColumn;
    @FXML
    private TableColumn<?, ?> NoofPassengersColumn;
    @FXML
    private TableColumn<?, ?> SourceColumn;
    @FXML
    private TableColumn<?, ?> DestinationColumn;
    @FXML
    private TableColumn<?, ?> FlightIDColumn;
    @FXML
    private TableColumn<?, ?> CheckBoxColumn;
    @FXML
    private ImageView Cancel_Button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
