/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.CallableStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import oracle.jdbc.OracleTypes;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class AboutAllPassengersController implements Initializable {

    @FXML
    private JFXTextField Name1;
    @FXML
    private JFXTextField Name2;
    @FXML
    private JFXTextField Name3;
    @FXML
    private JFXTextField Name4;
    @FXML
    private JFXTextField Name5;
    @FXML
    private JFXTextField Age1;
    @FXML
    private JFXTextField Age2;
    @FXML
    private JFXTextField Age3;
    @FXML
    private JFXTextField Age4;
    @FXML
    private JFXTextField Age5;
    @FXML
    private JFXComboBox<String> Gender1;
    @FXML
    private JFXComboBox<String> Gender2;
    @FXML
    private JFXComboBox<String> Gender3;
    @FXML
    private JFXComboBox<String> Gender4;
    @FXML
    private JFXComboBox<String> Gender5;
    @FXML
    private JFXButton BookTicketButton;
    @FXML
    private JFXButton BackButton;
    @FXML
    private Text AirlinesText;
    ObservableList<String> Genderr = FXCollections.observableArrayList("Male", "Female", "Others");

    @FXML
    private Text DateText;

    @FXML
    private Text NoOfPassengersText;

    @FXML
    private Text FareText;

    @FXML
    private Text FromText;

    @FXML
    private Text ToText;

    @FXML
    private Text DepartureText;

    @FXML
    private Text ArrivalText;
String Gen1,Gen2,Gen3,Gen4,Gen5;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        AirlinesText.setText(TicketAvailabilityWindowController.neww.getA());
        ArrivalText.setText(TicketAvailabilityWindowController.neww.getC());
        DepartureText.setText(TicketAvailabilityWindowController.neww.getB());
        FareText.setText(TicketAvailabilityWindowController.neww.getD());
        FromText.setText(HomePageWindowController.From_value);
        ToText.setText(HomePageWindowController.To_value);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String datestring = dateFormat.format(HomePageWindowController.date);
        DateText.setText(datestring);
        NoOfPassengersText.setText(Integer.toString(HomePageWindowController.passenger));
        Gender1.setItems(Genderr);
        Gender2.setItems(Genderr);
        Gender3.setItems(Genderr);
        Gender4.setItems(Genderr);
        Gender5.setItems(Genderr);
        Gender1.setOnAction((event) -> {

            Gen1= Gender1.getSelectionModel().getSelectedItem();
        });
        
        Gender2.setOnAction((event) -> {

            Gen2= Gender2.getSelectionModel().getSelectedItem();
        });
        
        Gender3.setOnAction((event) -> {

            Gen3= Gender3.getSelectionModel().getSelectedItem();
        });
        Gender4.setOnAction((event) -> {

            Gen4= Gender4.getSelectionModel().getSelectedItem();
        });
        Gender5.setOnAction((event) -> {

            Gen5= Gender5.getSelectionModel().getSelectedItem();
        });
        // TODO
        if(HomePageWindowController.passenger>0)
        {
            Name1.setVisible(true);
            Age1.setVisible(true);
            Gender1.setVisible(true);
            
        }
         if(HomePageWindowController.passenger>1)
        {
               Name2.setVisible(true);
            Age2.setVisible(true);
            Gender2.setVisible(true);
            
        }
          if(HomePageWindowController.passenger>2)
        {
               Name3.setVisible(true);
            Age3.setVisible(true);
            Gender3.setVisible(true);
            
        }
           if(HomePageWindowController.passenger>3)
        {
               Name4.setVisible(true);
            Age4.setVisible(true);
            Gender4.setVisible(true);
            
        }
            if(HomePageWindowController.passenger>4)
        {
               Name5.setVisible(true);
            Age5.setVisible(true);
            Gender5.setVisible(true);
        }
        
        
        BookTicketButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                try {
                    
                                String quer = "begin ticketbooking(?,?,?,?,?);end;";
                                
            CallableStatement s3;
            
            s3 = test.con.prepareCall(quer);
          //  s3.setString(1,TicketAvailabilityWindowController.neww.);
            s3.setString(2, "");
            s3.setDate(3, java.sql.Date.valueOf("2017-05-01"));
            s3.setInt(4,0);
            s3.setInt(5, 0);
            System.out.println();
            s3.executeUpdate();
                    
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FinalBookingInfo.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    root1.setId("paneSignUp");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    //stage4.getIcons().add(new Image("ico.png"));
                    stage4.setTitle("FinalBookingInfo");
                    Scene scene = new Scene(root1);
                    //scene.getStylesheets().addAll(this.getClass().getResource("styleChatRoom.css").toExternalForm());
                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) BookTicketButton.getScene().getWindow();
                    stage5.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

}


/*

create or replace procedure ticketbooking(
	flightid IN varchar2,
	date IN DATE,
	requestedSeats IN number,
	usrname IN varchar2,
	faretaken IN number


*/
