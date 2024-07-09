package pl.pepe.bankapp.controllers.client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {


    public Label ror_account_number_label;
    public Label ror_transaction_limit_label;
    public Label ror_date_created_label;
    public Label ror_balance_label;
    public Label saving_acc_number_label;
    public Label saving_acc_transaction_limit_label;
    public Label saving_acc_date_created_label;
    public Label saving_acc_balance_label;
    public TextField ror_to_saving_amount_text_field;
    public Button transfer_to_saving_acc_button;
    public TextField saving_to_ror_amount_text_field;


    public Button transfer_to_ror_button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
