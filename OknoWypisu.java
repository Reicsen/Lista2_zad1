package main.java.com.lista2_zad1;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class OknoWypisu
{
    public Stage okno;

    public OknoWypisu(Faktura f, Suma s)
    {
        Label infoglowne = new Label(f.wydrukDanych());
        infoglowne.setFont(Font.font("Callibri",FontWeight.BOLD,25));
        infoglowne.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infoglowne.setWrapText(true);
        infoglowne.setMaxWidth(Double.POSITIVE_INFINITY);

        Label infoosob = new Label(f.wydrukOsob());
        infoosob.setFont(Font.font("Callibri",FontWeight.BOLD,20));
        infoosob.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infoosob.setWrapText(true);
        infoosob.setMaxWidth(Double.POSITIVE_INFINITY);

        Label infoproduktow = new Label(f.wydrukElementow());
        infoproduktow.setFont(Font.font("Callibri",FontWeight.BOLD,15));
        infoproduktow.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infoproduktow.setWrapText(true);
        infoproduktow.setMaxWidth(Double.POSITIVE_INFINITY);

        Label infosumy = new Label(s.wydrukSumy());
        infosumy.setAlignment(Pos.CENTER);
        infosumy.setFont(Font.font("Callibri",FontWeight.BOLD,20));
        infosumy.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infosumy.setWrapText(true);
        infosumy.setMaxWidth(Double.POSITIVE_INFINITY);

        VBox siatka = new VBox(infoglowne,infoosob,infoproduktow,infosumy);
        Scene scena = new Scene(siatka);
        this.okno = new Stage();
        okno.setTitle("Zadanie 1.");
        siatka.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        siatka.setPrefHeight(Screen.getPrimary().getVisualBounds().getHeight());
        okno.setScene(scena);
        okno.setMinHeight(Screen.getPrimary().getVisualBounds().getWidth());
        okno.setMinWidth(Screen.getPrimary().getVisualBounds().getWidth());
        okno.show();
    }
}
