/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.net.URL;
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
public class OperatorChangePasswordWindowController implements Initializable {

    @FXML
    private JFXPasswordField OldPasswordTextField;
    @FXML
    private JFXPasswordField NewPasswordTextFild;
    @FXML
    private JFXPasswordField ConfirmPasswordTextField;
    @FXML
    private JFXButton ChangePasswordButton;
    @FXML
    private JFXButton BackButton;
     @FXML
    private Text WarningText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        BackButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OperatorMainWindow.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    root1.setId("paneOpMainWindow");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    //stage4.getIcons().add(new Image("ico.png"));
                    stage4.setTitle("Main Window");
                    Scene scene = new Scene(root1);
                    //scene.getStylesheets().addAll(this.getClass().getResource("styleChatRoom.css").toExternalForm());
                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) BackButton.getScene().getWindow();
                    stage5.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        ChangePasswordButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OperatorMainWindow.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    root1.setId("paneOpMainWindow");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    //stage4.getIcons().add(new Image("ico.png"));
                    stage4.setTitle("Main Window");
                    Scene scene = new Scene(root1);
                    //scene.getStylesheets().addAll(this.getClass().getResource("styleChatRoom.css").toExternalForm());
                    stage4.setScene(scene);
                    stage4.show();
                    Stage stage5;
                    stage5 = (Stage) BackButton.getScene().getWindow();
                    stage5.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }    
    
}
