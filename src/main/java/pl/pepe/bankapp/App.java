package pl.pepe.bankapp;

import javafx.application.Application;
import javafx.stage.Stage;
import pl.pepe.bankapp.models.Model;


public class App extends Application {


    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
