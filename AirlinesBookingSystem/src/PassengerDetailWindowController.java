/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class PassengerDetailWindowController implements Initializable {

    @FXML
    private TableView<Data3> PassengersTable;
    @FXML
    private TableColumn<Data3, String> FirstNameColumn;
    @FXML
    private TableColumn<Data3, String> LastNameColumn;
    @FXML
    private TableColumn<Data3, String> FlightIDColumn;
    @FXML
    private TableColumn<Data3, String> DateColumn;
    @FXML
    private TableColumn<Data3, String> FareColumn;
    @FXML
    private JFXButton BackButton;
    ObservableList<Data3> lst = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        FirstNameColumn.setCellValueFactory(new PropertyValueFactory<Data3, String>("a"));
        LastNameColumn.setCellValueFactory(new PropertyValueFactory<Data3, String>("b"));

        FlightIDColumn.setCellValueFactory(new PropertyValueFactory<Data3, String>("c"));
        DateColumn.setCellValueFactory(new PropertyValueFactory<Data3, String>("d"));
        FareColumn.setCellValueFactory(new PropertyValueFactory<Data3, String>("e"));

        try {

            String quer = "begin get_all_flights(?,?,?,?,?,?);end;";
            CallableStatement s3;

            s3 = test.con.prepareCall(quer);
            //s3.setString(1, Codes.get(HomePageWindowController.From_value));
            //s3.setString(2, Codes.get(HomePageWindowController.To_value));
            s3.setDate(3, HomePageWindowController.date);
            s3.setInt(4, HomePageWindowController.day);
            s3.setInt(5, HomePageWindowController.passenger);
            s3.registerOutParameter(6, OracleTypes.CURSOR);
            s3.execute();

            ResultSet rs = (ResultSet) s3.getObject(6);
            while (rs.next()) {
                System.out.println("fvsdgv");

                String a, b, c, d, e;
                a = rs.getString(1);
                b = rs.getString(2);
                c = rs.getString(3);
                d = rs.getString(4);
                e = Integer.toString(rs.getInt(5));
                Data3 qq = new Data3(a, b, c, d, e);
                System.out.println(a + b + c + d + e);

                lst.add(qq);

            }
            PassengersTable.setItems(lst);

        } catch (SQLException ex) {
            Logger.getLogger(TicketAvailabilityWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
