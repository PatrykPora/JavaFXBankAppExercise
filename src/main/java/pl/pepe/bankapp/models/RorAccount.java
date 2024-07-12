package pl.pepe.bankapp.models;

import javafx.beans.property.IntegerProperty;

public class RorAccount extends Account{

    private final IntegerProperty transactionNumberLimit;

    public RorAccount(String owner, String accountNumber, double balance, IntegerProperty transactionNumberLimit) {
        super(owner, accountNumber, balance);
        this.transactionNumberLimit = transactionNumberLimit;
    }

    public IntegerProperty transactionNumberLimitProperty() {
        return transactionNumberLimit;
    }
}
