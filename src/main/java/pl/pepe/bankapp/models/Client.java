package pl.pepe.bankapp.models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Client {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty peyeeAddress;
    private final ObjectProperty<Account> rorAccount;
    private final ObjectProperty<Account> savinaAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Client(String firstName, String lastName, String peyeeAddress, Account rorAccount, Account savinaAccount, LocalDate dateCreated) {
        this.firstName = new SimpleStringProperty(this, "first name", firstName);
        this.lastName = new SimpleStringProperty(this, "last name", lastName);
        this.peyeeAddress = new SimpleStringProperty(this, "payee address", peyeeAddress);
        this.rorAccount = new SimpleObjectProperty<>(this, "rorAccount", rorAccount);
        this.savinaAccount = new SimpleObjectProperty<>(this, "savingAccount", savinaAccount);
        this.dateCreated = new SimpleObjectProperty<>(this, "createdDate", dateCreated);
    }


    public StringProperty firstNameProperty() {
        return firstName;
    }


    public StringProperty lastNameProperty() {
        return lastName;
    }


    public StringProperty peyeeAddressProperty() {
        return peyeeAddress;
    }


    public ObjectProperty<Account> rorAccountProperty() {
        return rorAccount;
    }


    public ObjectProperty<Account> savinaAccountProperty() {
        return savinaAccount;
    }


    public ObjectProperty<LocalDate> dateCreatedProperty() {
        return dateCreated;
    }
}
