package pl.pepe.bankapp.controllers.admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import pl.pepe.bankapp.models.Model;
import pl.pepe.bankapp.views.AdminMenuOptions;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button create_client_button;

    public Button clients_button;
    public Button deposit_button;
    public Button logout_button;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }


    private void addListeners() {

    }

    private void onCreateClient() {
        Model.getInstance().getViewFactory().getADMIN_SELECTED_MENU_ITEM().set(AdminMenuOptions.CREATE_CLIENT);
    }
}
