package pl.pepe.bankapp.controllers.client;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import pl.pepe.bankapp.models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {

    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getCLIENT_SELECTED_MENU_ITEM().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case "Transactions" ->
                        client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
                default -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
