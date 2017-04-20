/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 * FXML Controller class
 *
 * @author vips
 */
public class TicketAvailabilityWindowController implements Initializable {

    @FXML
    private JFXButton MyProfileButton;
    @FXML
    private JFXButton LogOutButton;
    @FXML
    private JFXButton ModifyButton;
    @FXML
    private Text FromText;
    @FXML
    private Text ToText;
    @FXML
    private Text DateText;
    @FXML
    private Text NoofPassengersText;
    @FXML
    private Text ClassText;
    @FXML
    private TableView<Data> PlaneTable;
    @FXML
    private TableColumn<Data, String> AirlinesColumn;
    @FXML
    private TableColumn<Data, String> DepartureColumn;
    @FXML
    private TableColumn<Data, String> ArrivalColumn;
    @FXML
    private TableColumn<Data, String> FareColumn;
    @FXML
    private TableColumn<Data, String> DurationColumn;

    ObservableList<Data> lst = FXCollections.observableArrayList();

    /**
     * Initializes th controller class..
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        FromText.setText(HomePageWindowController.From_value);
        ToText.setText(HomePageWindowController.To_value);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String datestring = dateFormat.format(HomePageWindowController.date);
        DateText.setText(datestring);
        NoofPassengersText.setText(Integer.toString(HomePageWindowController.passenger));
        ClassText.setText(HomePageWindowController.Class);

        AirlinesColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("a"));
        DepartureColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("b"));

        ArrivalColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("c"));
        FareColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("d"));
        DurationColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("e"));

     

        try {
           
            String quer = "begin get_all_flights(?,?,?,?,?,?);end;";
      CallableStatement s3;

            s3 = test.con.prepareCall(quer);
            s3.setString(1, HomePageWindowController.Codes.get(HomePageWindowController.From_value));
            s3.setString(2, HomePageWindowController.Codes.get(HomePageWindowController.To_value));
            s3.setDate(3, HomePageWindowController.date);
            s3.setInt(4, HomePageWindowController.day);
            s3.setInt(5, HomePageWindowController.passenger);
            s3.registerOutParameter(6, OracleTypes.CURSOR);
            s3.execute();
            ResultSet rs = ((OracleCallableStatement) s3).getCursor(6);
            while (rs.next()) {
                                      System.out.println("fvsdgv");

                String a,b,c,d,e;
               a= rs.getString(1);
                b= rs.getString(2);
                 c= rs.getString(3);
                  d= rs.getString(4);
                   e= Integer.toString(rs.getInt(5));
                      Data qq = new Data(a,b,c,d,e);
                      System.out.println(a+b+c+d+e);

        lst.add(qq);
        PlaneTable.setItems(lst);
                
      }
            
            

        } catch (SQLException ex) {
            Logger.getLogger(TicketAvailabilityWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }

        MyProfileButton.setOnAction(new EventHandler<ActionEvent>() {

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
                    stage5 = (Stage) MyProfileButton.getScene().getWindow();
                    stage5.close();

                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        LogOutButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                try {
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
                    stage5 = (Stage) LogOutButton.getScene().getWindow();
                    stage5.close();

                } catch (IOException ex) {
                    Logger.getLogger(HomePageWindowController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

}
