package pl.pepe.bankapp.controllers.admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import pl.pepe.bankapp.models.Client;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientCellController implements Initializable {
    public Label fname_label;
    public Label lname_label;
    public Label peyee_address_label;
    public Label ror_number_label;
    public Label saving_acc_label;
    public Label date_creaated_label;
    public Button delete_label;
    private final Client client;

    public ClientCellController(Client client) {
        this.client = client;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
