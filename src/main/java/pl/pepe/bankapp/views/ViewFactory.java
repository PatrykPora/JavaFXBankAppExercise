package pl.pepe.bankapp.views;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import pl.pepe.bankapp.controllers.client.ClientController;

public class ViewFactory {

    // Client View

    // client_selected_menu_item will be used to change the view on action
    private final StringProperty CLIENT_SELECTED_MENU_ITEM;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;



    private AnchorPane accountsView;

    public ViewFactory() {
        this.CLIENT_SELECTED_MENU_ITEM = new SimpleStringProperty("");
    }


    public StringProperty getCLIENT_SELECTED_MENU_ITEM() {
        return CLIENT_SELECTED_MENU_ITEM;
    }

    public StringProperty CLIENT_SELECTED_MENU_ITEMProperty() {
        return CLIENT_SELECTED_MENU_ITEM;
    }

    public AnchorPane getDashboardView() {
        // check if anchorPane is null cos we don't want to load resources everytime user go to this view
        if (dashboardView == null) {
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/fxml/client/Dashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public AnchorPane getAccountsView() {
        if (accountsView == null) {
            try {
                accountsView = new FXMLLoader(getClass().getResource("/fxml/client/Accounts.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return accountsView;
    }

    public AnchorPane getTransactionsView() {
        if (transactionsView == null) {
            try {
                transactionsView = new FXMLLoader(getClass().getResource("/fxml/client/transactions.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return transactionsView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        createStage(loader);
    }


    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);

    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("PoroBank");
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}
