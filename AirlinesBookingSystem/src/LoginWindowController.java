/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RAKA
 */
public class LoginWindowController implements Initializable {

    @FXML
    private JFXTextField UsernameTextField;
    @FXML
    private JFXTextField PasswordTextField;
    @FXML
    private JFXButton SignInButton;
    @FXML
    private JFXButton BackButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         BackButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GeneralLoginWindow.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    root1.setId("paneGeneralLogin");
                    Stage stage4 = new Stage();
                    stage4.resizableProperty().setValue(Boolean.FALSE);
                    //stage4.getIcons().add(new Image("ico.png"));
                    stage4.setTitle("Login Window");
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
         
         SignInButton.setOnAction(new EventHandler<ActionEvent>() {

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
