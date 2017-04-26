/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
public static LocalDate  date;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        ChangePasswordButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OperatorChangePasswordWindow.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    root1.setId("paneOperatorMainWindow");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    //stage4.getIcons().add(new Image("ico.png"));
                    stage4.setTitle("Operator Window");
                    Scene scene = new Scene(root1);
                    //scene.getStylesheets().addAll(this.getClass().getResource("styleChatRoom.css").toExternalForm());
                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) ChangePasswordButton.getScene().getWindow();
                    stage5.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        UpdateFlightButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                try {
                    
                    
                    date =PickDate1.getValue();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UpdateFlightWindow.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    root1.setId("paneUpdaetFlightWindow");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    //stage4.getIcons().add(new Image("ico.png"));
                    stage4.setTitle("UpdaetFlight Window");
                    Scene scene = new Scene(root1);
                    //scene.getStylesheets().addAll(this.getClass().getResource("styleChatRoom.css").toExternalForm());
                    stage4.setScene(scene);
                    Stage stage5;
                    stage5 = (Stage) ChangePasswordButton.getScene().getWindow();
                    stage5.close();
                    stage4.show();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        DetailpassengerButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PassengerDetailWindow.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    root1.setId("paneDetailPassengerWindow");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    //stage4.getIcons().add(new Image("ico.png"));
                    stage4.setTitle("Passenger Detail Window");
                    Scene scene = new Scene(root1);
                    //scene.getStylesheets().addAll(this.getClass().getResource("styleChatRoom.css").toExternalForm());
                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) ChangePasswordButton.getScene().getWindow();
                    stage5.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }    
    
}
