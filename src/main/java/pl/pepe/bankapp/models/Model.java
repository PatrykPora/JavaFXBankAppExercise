package pl.pepe.bankapp.models;

import pl.pepe.bankapp.views.ViewFactory;

public class Model {
// our Model class is a singleton class that is responsible to gives our views through the whole application
//    it has our ViewFactoryInstance that is responsible for showing views
    private static Model model;
    private final ViewFactory viewFactory;

    private Model() {
        this.viewFactory = new ViewFactory();
    }

    public static synchronized Model getInstance() {
        if (model == null){
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
