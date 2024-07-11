package pl.pepe.bankapp.controllers.client;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import pl.pepe.bankapp.models.Transaction;

import java.net.URL;
import java.util.ResourceBundle;

public class TransactionsCellController implements Initializable {
    public FontAwesomeIconView in_arrow_icon;
    public FontAwesomeIconView out_arrow_icon;
    public Label transaction_date_label;
    public Label sender_name_label;
    public Label reciver_name_label;
    public Label transaction_amount_label;
    private final Transaction transaction;


    public TransactionsCellController(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
