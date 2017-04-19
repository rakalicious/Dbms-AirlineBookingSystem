/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

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
    @FXML
    private TableColumn<Data, String> ChooseColumn;
    ObservableList<Data> lst = FXCollections.observableArrayList();

    /**
     * Initializes th controller class..
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        AirlinesColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("a"));
        DepartureColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("b"));

        ArrivalColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("c"));
        FareColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("d"));
        DurationColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("e"));
        ChooseColumn.setCellValueFactory(new PropertyValueFactory<Data, String>("f"));

      
        Data qq = new Data("jsbkc","gvdsv","dsfvds","saf","afv","asf");

        lst.add(qq);
        PlaneTable.setItems(lst);
        // PlaneTable.getItems().addAll(qq);
        // PlaneTable.getColumns().add("dgdgbdsv","dsgvsdgsdv","gbsdgsdgfd","gvsdvgs","sdgvds","dvssg"));

        // TODO
    }

}
