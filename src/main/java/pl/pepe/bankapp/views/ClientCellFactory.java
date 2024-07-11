package pl.pepe.bankapp.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import pl.pepe.bankapp.controllers.admin.ClientCellController;
import pl.pepe.bankapp.models.Client;

public class ClientCellFactory extends ListCell<Client> {

    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/admin/clientCell.fxml"));
            ClientCellController controller = new ClientCellController(client);
            // this is how we add controller to fxml file in a program
            // pay attention that we removed a controller from clientCell.fxml file
            // in this case we will operate on every client separately. It is like we set controller for every client
            loader.setController(controller);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
