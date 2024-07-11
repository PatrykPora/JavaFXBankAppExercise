package pl.pepe.bankapp.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import pl.pepe.bankapp.controllers.client.TransactionsCellController;
import pl.pepe.bankapp.models.Transaction;

public class TransactionCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/client/transactionsCell"));
            TransactionsCellController controller = new TransactionsCellController(transaction);
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
