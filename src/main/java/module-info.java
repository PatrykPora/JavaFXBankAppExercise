module pl.pepe.bankapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens pl.pepe.bankapp to javafx.fxml;
    exports pl.pepe.bankapp;
    exports pl.pepe.bankapp.controllers;
    exports pl.pepe.bankapp.controllers.admin;
    exports pl.pepe.bankapp.controllers.client;
    exports pl.pepe.bankapp.models;
    exports pl.pepe.bankapp.views;

}