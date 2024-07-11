package pl.pepe.bankapp.models;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Transaction {

    // StringProperty (and all those .....Property classes ) are  a classes from java fx framework that are OBSERVABLE
    // it lets us binding this to labels textControls end so on
    private final StringProperty sender;
    private final StringProperty receiver;
    private final DoubleProperty amount;
    private final ObjectProperty<LocalDate> date;
    private final StringProperty message;

    public Transaction(String sender, String receiver, double amount, LocalDate date, String message) {
        this.sender = new SimpleStringProperty(this, "sender", sender);
        this.receiver = new SimpleStringProperty(this, "receiver", receiver);
        this.amount = new SimpleDoubleProperty(this, "amount", amount);
        this.date = new SimpleObjectProperty<>(this, "date", date);
        this.message = new SimpleStringProperty(this, "message", message);
    }
    /**
     * when you use properties like StringProperty, DoubleProperty, etc.,
     * you often want to observe changes to these properties.
     * By returning the property itself (this.sender),
     * you allow external classes to register listeners directly on the property.
     * This enables reactive programming and simplifies handling property changes.
     **/


    public StringProperty senderProperty() {
        return this.sender;
    }


    public StringProperty receiverProperty() {
        return receiver;
    }

    public DoubleProperty amountProperty() {
        return this.amount;
    }


    public ObjectProperty<LocalDate> dateProperty() {
        return this.date;
    }

    public StringProperty messageProperty() {
        return this.message;
    }

}
