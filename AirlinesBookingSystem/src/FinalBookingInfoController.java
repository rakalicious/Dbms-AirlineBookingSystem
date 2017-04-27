/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author vips
 */
public class FinalBookingInfoController implements Initializable {

    @FXML
    private Text From_Text;
    @FXML
    private Text ToTextField;
    @FXML
    private Text DateTextField;
    @FXML
    private Text PassengerTextField;
    @FXML
    private Text PnrTextField;
    @FXML
    private Text FlightIdTextField;
        @FXML
    private Text Fare_Text_Field;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ToTextField.setText(HomePageWindowController.To_value);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String datestring = dateFormat.format(HomePageWindowController.date);
        DateTextField.setText(datestring);
        PassengerTextField.setText(Integer.toString(HomePageWindowController.passenger));
        PnrTextField.setText(AboutAllPassengersController.PNR);
        FlightIdTextField.setText(AboutAllPassengersController.FlightId);
        From_Text.setText(HomePageWindowController.From_value);
   Fare_Text_Field.setText(Integer.toString(AboutAllPassengersController.FARE));
    }

}
