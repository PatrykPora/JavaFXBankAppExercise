package pl.pepe.bankapp.models;

import javafx.beans.property.DoubleProperty;

public class SavingAccount extends Account {

    private final DoubleProperty withdrawLimit;

    public SavingAccount(String owner, String accountNumber, double balance, DoubleProperty withdrawLimit) {
        super(owner, accountNumber, balance);
        this.withdrawLimit = withdrawLimit;
    }


    public DoubleProperty withdrawLimitProperty() {
        return withdrawLimit;
    }
}
