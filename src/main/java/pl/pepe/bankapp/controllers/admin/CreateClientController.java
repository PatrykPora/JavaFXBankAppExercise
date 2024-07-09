package pl.pepe.bankapp.controllers.admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {
    public TextField first_name_text_field;
    public TextField last_name_text_field;
    public TextField password_text_field;
    public CheckBox payee_address_check_box;
    public Label payee_address_label;
    public CheckBox add_ror_check_box;
    public TextField ror_balance_text_field;
    public CheckBox add_saving_acc_check_box;
    public TextField saving_acc_balance_text_field;
    public Button create_new_client_button;
    public Label error_label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
