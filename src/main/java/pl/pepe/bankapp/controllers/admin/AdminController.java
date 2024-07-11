package pl.pepe.bankapp.controllers.admin;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import org.controlsfx.control.PropertySheet;
import pl.pepe.bankapp.models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    public BorderPane admin_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getADMIN_SELECTED_MENU_ITEM().addListener((observableValue, oldVal, newVal) ->{
            switch (newVal) {
                case CLIENTS -> admin_parent.setCenter(Model.getInstance().getViewFactory().getClientsView());
                case DEPOSIT -> admin_parent.setCenter(Model.getInstance().getViewFactory().getDepositView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
            }
        } );
    }
}
