package pl.pepe.bankapp.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.pepe.bankapp.models.Model;
import pl.pepe.bankapp.views.AccountTypeUser;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox<AccountTypeUser> account_selector;
    public Label payee_address;
    public TextField payee_address_field;
    public Label password_label;
    public TextField password_field;
    public Button login_btn;
    public Label error_label;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        account_selector.setItems(FXCollections.observableArrayList(AccountTypeUser.CLIENT, AccountTypeUser.ADMIN));
        account_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        account_selector.valueProperty().addListener(observable -> Model.getInstance().getViewFactory().setLoginAccountType(account_selector.getValue()));
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        // we want to close the window with login view
        // javaFx does not give as a way to get the stage
        // we hack this by getting stage for example by windows label
        Stage stage = (Stage) error_label.getScene().getWindow();


        if (Model.getInstance().getViewFactory().getLoginAccountType() == AccountTypeUser.CLIENT) {

            Model.getInstance().evaluateClientCredentials(payee_address_field.getText(), password_field.getText());

            if (Model.getInstance().isClientLoginSuccessFlag()) {
                Model.getInstance().getViewFactory().showClientWindow();

                Model.getInstance().getViewFactory().closeStage(stage);
            } else {
                payee_address_field.setText("");
                password_field.setText("");
                error_label.setText("wrong login credentials");
            }

        } else {
            Model.getInstance().getViewFactory().showAdminWindow();
        }

    }
}
