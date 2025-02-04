package pl.pepe.bankapp.controllers.client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import pl.pepe.bankapp.models.Model;
import pl.pepe.bankapp.views.ClientMenuOptions;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button transaction_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_problem_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addListeners();
    }

    private void addListeners() {
        dashboard_btn.setOnAction(event -> onDashboard());
        transaction_btn.setOnAction(event -> onTransactions());
        accounts_btn.setOnAction(event -> onAccounts());
    }

    private void onTransactions() {
        Model.getInstance().getViewFactory().getCLIENT_SELECTED_MENU_ITEM().set(ClientMenuOptions.TRANSACTIONS);
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getCLIENT_SELECTED_MENU_ITEM().set(ClientMenuOptions.DASHBOARD);
    }

    private void onAccounts() {
        Model.getInstance().getViewFactory().getCLIENT_SELECTED_MENU_ITEM().set(ClientMenuOptions.ACCOUNTS);
    }
}
