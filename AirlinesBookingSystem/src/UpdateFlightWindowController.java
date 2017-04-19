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
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class UpdateFlightWindowController implements Initializable {

    @FXML
    private JFXButton BackButton;
    @FXML
    private JFXButton AppplyChangesButton;
    @FXML
    private TreeTableView<?> TableFlights;
     @FXML
    private TreeTableColumn<?, ?> FlightIdColumn;

    @FXML
    private TreeTableColumn<?, ?> SourceColumn;

    @FXML
    private TreeTableColumn<?, ?> DestinationColumn;

    @FXML
    private TreeTableColumn<?, ?> DistanceColumn;

    @FXML
    private TreeTableColumn<?, ?> DepartsColumn;

    @FXML
    private TreeTableColumn<?, ?> ReachesDestinationColumn;

    @FXML
    private TreeTableColumn<?, ?> StatusColumn;

    @FXML
    private TreeTableColumn<?, ?> SeatsRewmainigColumn;
    private Text DateText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
