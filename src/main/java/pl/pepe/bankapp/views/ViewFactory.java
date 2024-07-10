package pl.pepe.bankapp.views;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import pl.pepe.bankapp.controllers.admin.AdminController;
import pl.pepe.bankapp.controllers.client.ClientController;

public class ViewFactory {

    private AccountTypeUser loginAccountType;

    // Client View
    // client_selected_menu_item will be used to change the view on action
    private final ObjectProperty<ClientMenuOptions> CLIENT_SELECTED_MENU_ITEM;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

//    admin views

    private AnchorPane createClientView;
    private final ObjectProperty<AdminMenuOptions> ADMIN_SELECTED_MENU_ITEM;

    public ViewFactory() {
        this.loginAccountType = AccountTypeUser.CLIENT;
        this.CLIENT_SELECTED_MENU_ITEM = new SimpleObjectProperty<>();
        this.ADMIN_SELECTED_MENU_ITEM = new SimpleObjectProperty<>();
    }

    public AccountTypeUser getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountTypeUser loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    public ObjectProperty<ClientMenuOptions> getCLIENT_SELECTED_MENU_ITEM() {
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

    public void showAdminWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/admin/Admin.fxml"));
        AdminController controller = new AdminController();
        loader.setController(controller);
        createStage(loader);
    }

    public AnchorPane getCreateClientView() {
        if (createClientView == null) {
            try {
                createClientView = new FXMLLoader(getClass().getResource("/fxml/admin/CreateClient.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return createClientView;
    }

    public ObjectProperty<AdminMenuOptions> getADMIN_SELECTED_MENU_ITEM() {
        return ADMIN_SELECTED_MENU_ITEM;
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
