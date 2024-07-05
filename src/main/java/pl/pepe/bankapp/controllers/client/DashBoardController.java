package pl.pepe.bankapp.controllers.client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController implements Initializable {
    public Text user_name_text;
    public Label login_date_label;
    public Text account_summary_text;
    public Text my_accounts_text;
    public Label income_amount_label;
    public Label expense_amount_label;
    public Label ror_balance_label;
    public Label ror_number;
    public Label ror_text;
    public Label saving_balance_label;
    public Label saving_balance;
    public Label saving_acc_text;
    public ListView latest_transactions_list_view;
    public TextField payee_text_field;
    public TextField amount_in_currency_text_field;
    public TextArea message_text_area;
    public Button send_money_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
