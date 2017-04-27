/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author vips
 */
public class HomePageWindowController implements Initializable {

    @FXML
    private AnchorPane Plane;
    @FXML
    private ComboBox<String> From_Combo_Box;
    @FXML
    private ComboBox<String> To_Combo_Box;
    @FXML
    private ComboBox<String> Class_Combo_Box;
    @FXML
    private JFXButton Submit_Quick_Book;
    @FXML
    private JFXDatePicker Date_Field;
    @FXML
    private JFXComboBox<Integer> No_Of_Passenger_Field;
    @FXML
    private Hyperlink Booking_History_Link;
    @FXML
    private Hyperlink Cancel_Ticket_Link;
    @FXML
    private JFXButton LogOut_Botton;
    @FXML
    private JFXButton My_Profile_Button;
    @FXML
    private Text Warning_Text;
    @FXML
    private JFXButton Check_Status;
    @FXML
    private JFXTextField Booking_Id_Flight_Status;
   public static String From_value = "", To_value = "", Class;
   public static Date date;
    public static int day;
    public static  int passenger;
    ObservableList<String> from = FXCollections.observableArrayList("Dubai", "Jaipur", "Ahmedabad", "Delhi", "Mumbai", "Kolkata", "Banglore", "Hyderabad", "Chennai", "Pune");
    ObservableList<String> classs = FXCollections.observableArrayList("Business", "Economy");
    ObservableList<Integer> passengers = FXCollections.observableArrayList(1, 2, 3, 4, 5);

 
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         From_Combo_Box.setItems(from);
        To_Combo_Box.setItems(from);
        Class_Combo_Box.setItems(classs);
        No_Of_Passenger_Field.setItems(passengers);
        
        From_Combo_Box.setOnAction((event) -> {

            From_value = (String) From_Combo_Box.getSelectionModel().getSelectedItem();
            if (To_value.equals(From_value)) {
                Warning_Text.setText("Source and Destination are same!!");
            } else {
                Warning_Text.setText("");
            }

        });
        To_Combo_Box.setOnAction((event) -> {

            To_value = (String) To_Combo_Box.getSelectionModel().getSelectedItem();
            if (To_value.equals(From_value)) {
                Warning_Text.setText("Source and Destination are same!!");
            } else {
                Warning_Text.setText("");
            }
        });
        Class_Combo_Box.setOnAction((event) -> {

            Class = (String) Class_Combo_Box.getSelectionModel().getSelectedItem();
        });

       
        No_Of_Passenger_Field.setOnAction((event) -> {

            passenger = (Integer) No_Of_Passenger_Field.getSelectionModel().getSelectedItem();
        });

        My_Profile_Button.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                try {

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MyProfile.fxml"));
                    Parent root1;

                    root1 = (Parent) fxmlLoader.load();

                    root1.setId("paneMyProfile");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    stage4.setTitle("MyProfile");
                    Scene scene = new Scene(root1);
                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) My_Profile_Button.getScene().getWindow();
                    stage5.close();

                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        Submit_Quick_Book.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                date = java.sql.Date.valueOf(Date_Field.getValue());
                Calendar c = Calendar.getInstance();
                c.setTime(date);
                day = c.get(Calendar.DAY_OF_WEEK);

                System.out.println(From_value);
                System.out.println(To_value);
                 System.out.println(date);
                System.out.println(day);
                System.out.println(passenger);
                System.out.println(Class);
                try {

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TicketAvailabilityWindow.fxml"));
                    Parent root1;

                    root1 = (Parent) fxmlLoader.load();

                    root1.setId("paneMyProfile");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    stage4.setTitle("MyProfile");
                    Scene scene = new Scene(root1);
                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) My_Profile_Button.getScene().getWindow();
                    stage5.close();

                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        LogOut_Botton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                
                try{
                 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GeneralLoginWindow.fxml"));
                    Parent root1;

                    root1 = (Parent) fxmlLoader.load();

                    root1.setId("pane");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    stage4.setTitle("Login");
                    Scene scene = new Scene(root1);
                                scene.getStylesheets().addAll(this.getClass().getResource("x.css").toExternalForm());

                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) LogOut_Botton.getScene().getWindow();
                    stage5.close();
                
                
                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
            }});
            Booking_History_Link.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                
                try{
                 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookingHistoryWindow.fxml"));
                    Parent root1;

                    root1 = (Parent) fxmlLoader.load();

                    root1.setId("pane");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    stage4.setTitle("BookingHistory");
                    Scene scene = new Scene(root1);
                                scene.getStylesheets().addAll(this.getClass().getResource("x.css").toExternalForm());

                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) LogOut_Botton.getScene().getWindow();
                    stage5.close();
                
                
                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
            }});
                        Cancel_Ticket_Link.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                
                try{
                 FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Cancel_Ticket_Window.fxml"));
                    Parent root1;

                    root1 = (Parent) fxmlLoader.load();

                    root1.setId("pane");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    stage4.setTitle("Cancel_Ticket_Link");
                    Scene scene = new Scene(root1);
                                scene.getStylesheets().addAll(this.getClass().getResource("x.css").toExternalForm());

                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) LogOut_Botton.getScene().getWindow();
                    stage5.close();
                
                
                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
            }});
            
            
    
    
    }

    

    @FXML
    private void initialize(MouseEvent event) {
    }

}
