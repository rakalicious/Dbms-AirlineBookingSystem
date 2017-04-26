/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.math.BigInteger;
import java.net.URL;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Text;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

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
    private TableView<Data2> TableFlights;
    @FXML
    private TableColumn<Data2, String> FlightIdColumn;

    @FXML
    private TableColumn<Data2, String> SourceColumn;

    @FXML
    private TableColumn<Data2, String> DestinationColumn;

    @FXML
    private TableColumn<Data2, String> DepartsColumn;

    @FXML
    private TableColumn<Data2, String> ReachesDestinationColumn;

    @FXML
    private TableColumn<Data2, String> StatusColumn;

    @FXML
    private TableColumn<Data2, String> SeatsRewmainigColumn;

    public static HashMap<String, String> Codes;
    private Text DateText;
    ObservableList<Data2> lst = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        TableFlights.setEditable(true);
       /* StatusColumn.setOnEditCommit(
    new EventHandler<CellEditEvent<Data2, String>>() {
            @Override
            public void handle(CellEditEvent<Data2, String> event) {
                ((Data2) event.getTableView().getItems().get(
                event.getTablePosition().getRow())
                ).setF(event.getNewValue());
               
            }
      
    }
);*/
        //TableFlights.getSelectionModel().selectedIndexProperty().addListener(
          //      new edit());
         // TableFlights.setSelectionModel();
//TableFlights.getSelectionModel().getSelectedItem();
        
        
        
        
        
      

        FlightIdColumn.setCellValueFactory(new PropertyValueFactory<Data2, String>("a"));
        SourceColumn.setCellValueFactory(new PropertyValueFactory<Data2, String>("b"));

        DestinationColumn.setCellValueFactory(new PropertyValueFactory<Data2, String>("c"));
        DepartsColumn.setCellValueFactory(new PropertyValueFactory<Data2, String>("d"));
        ReachesDestinationColumn.setCellValueFactory(new PropertyValueFactory<Data2, String>("e"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<Data2, String>("f"));
        SeatsRewmainigColumn.setCellValueFactory(new PropertyValueFactory<Data2, String>("g"));

        try {

            String quer = "select f.flight_id,f.src,f.dest,f.departure,f.arrival,t.status from (select * from flight_schedule where day = ?) f \n"
                    + "left outer join (\n"
                    + "	select s.flight_id as flight_id, s.status as Status from current_runnning_status s \n"
                    + "	where dt = ?\n"
                    + ") t on f.flight_id = t.flight_id";
            PreparedStatement s3;
           Calendar ccc = Calendar.getInstance();
                ccc.setTime(java.sql.Date.valueOf(OperatorMainWindowController.date));

            s3 = test.con.prepareStatement(quer);

               s3.setInt(1,ccc.get(Calendar.DAY_OF_WEEK));
            s3.setDate(2,java.sql.Date.valueOf(OperatorMainWindowController.date));
            ResultSet rs = s3.executeQuery();
            

            while (rs.next()) {
                System.out.println("fvsdgv");

                String a, b, c, d, e, f, g, h;
                a = rs.getString(1);
                b = rs.getString(2);
                c = rs.getString(3);
                d = rs.getString(4);
                e = "dsv";
                f = rs.getString(5);
                g = rs.getString(6);
                if (rs.wasNull()) {
                    g = "ON TIME";
                }
         
            String query = "begin find_seats(?,?,?);end;";
            CallableStatement s;
                        s = test.con.prepareCall(query);

           s.setString(1, a);
           s.setDate(2,java.sql.Date.valueOf(OperatorMainWindowController.date));

s.registerOutParameter(3,OracleTypes.NUMBER);
s.executeUpdate();
java.math.BigDecimal x=(java.math.BigDecimal)s.getObject(3);
System.out.println(x);

            
            
                Data2 qq = new Data2(a, b, c, d, f, g,x.toString());
                System.out.println(a + b + c + d + e + f + g);

                lst.add(qq);

            }
            TableFlights.setItems(lst);

        } catch (SQLException ex) {
            Logger.getLogger(TicketAvailabilityWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
   
    private class edit implements ChangeListener{

        
        @Override
        public void changed(ObservableValue observable, Object oldValue, Object newValue) {
            String d=newValue.toString();
            System.out.println();
        }


}
}