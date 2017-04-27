/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

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
    private ImageView Cancel_Button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
         Home_Botton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                
                try{
                 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomePageWindow.fxml"));
                    Parent root1;

                    root1 = (Parent) fxmlLoader.load();

                    root1.setId("pane");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    stage4.setTitle("Home_Botton");
                    Scene scene = new Scene(root1);
                                scene.getStylesheets().addAll(this.getClass().getResource("x.css").toExternalForm());

                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) Home_Botton.getScene().getWindow();
                    stage5.close();
                
                
                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
            }});
        // TODO
    }    
    
}
