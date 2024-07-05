package pl.pepe.bankapp.controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.pepe.bankapp.models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox account_selector;
    public Label payee_address;
    public TextField payee_address_field;
    public Label password_label;
    public TextField password_field;
    public Button login_btn;
    public Label error_label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        // we want to close the window with login view
        // javaFx does not give as a way to get the stage
        // so we hack this by getting stage for example by windows label
        Stage stage = (Stage) error_label.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientWindow();
    }
}
