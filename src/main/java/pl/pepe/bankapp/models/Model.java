package pl.pepe.bankapp.models;

import pl.pepe.bankapp.database.DatabaseDriver;
import pl.pepe.bankapp.views.AccountTypeUser;
import pl.pepe.bankapp.views.ViewFactory;

import java.sql.ResultSet;
import java.time.LocalDate;

public class Model {
    // our Model class is a singleton class that is responsible to gives our views through the whole application
//    it has our ViewFactoryInstance that is responsible for showing views
    private static Model model;
    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;

    private AccountTypeUser loginAccountType = AccountTypeUser.CLIENT;
    // client data section
    private Client client;
    private boolean clientLoginSuccessFlag;


    // admin data section


    private Model() {
        this.viewFactory = new ViewFactory();
        this.databaseDriver = new DatabaseDriver();
        // client data section
        this.clientLoginSuccessFlag = false;
        this.client = new Client("", "", "", null, null, null);


        // admin data section
    }

    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabaseDriver() {
        return databaseDriver;
    }

    public AccountTypeUser getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountTypeUser loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    /*
    client method section
     */

    public boolean isClientLoginSuccessFlag() {
        return clientLoginSuccessFlag;
    }

    public void setClientLoginSuccessFlag(boolean flag) {
        this.clientLoginSuccessFlag = flag;
    }

    public void evaluateClientCredentials(String address, String password) {
        RorAccount rorAccount;
        SavingAccount savingAccount;
        ResultSet resultSet = databaseDriver.getClientData(address, password);
        try {
            if (resultSet.isBeforeFirst()) {
                this.client.firstNameProperty().set(resultSet.getString("FirstName"));
                this.client.lastNameProperty().set(resultSet.getString("LastName"));
                this.client.peyeeAddressProperty().set(resultSet.getString("PayeeAddress"));
                String[] dataParts = resultSet.getString("Date").split("-");
                LocalDate date = LocalDate.of(Integer.parseInt(dataParts[0]), Integer.parseInt(dataParts[1]), Integer.parseInt(dataParts[2]));
                this.client.dateCreatedProperty().set(date);

                this.clientLoginSuccessFlag = true;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Client getClient() {
        return client;
    }


}
