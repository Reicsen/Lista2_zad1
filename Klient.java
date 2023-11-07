package main.java.com.lista2_zad1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Klient extends Application
{
    public Faktura faktura;

    boolean czyText(TextArea pole)
    {
        String temp = pole.getText();
        return temp.isEmpty();
    }

    @Override
    public void start(Stage baza)
    {
        Label polecenie1 = new Label("Podaj numer faktury:");
        polecenie1.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie1.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie1.setWrapText(true);
        polecenie1.setMaxWidth(500.0);

        Label polecenie2 = new Label("Podaj datę sprzedaży:");
        polecenie2.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie2.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie2.setWrapText(true);
        polecenie2.setMaxWidth(500.0);

        Label polecenie3 = new Label("Podaj datę wystawienia:");
        polecenie3.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie3.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie3.setWrapText(true);
        polecenie3.setMaxWidth(500.0);

        Label polecenie4 = new Label("Podaj sprzedawcę:");
        polecenie4.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie4.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie4.setWrapText(true);
        polecenie4.setMaxWidth(500.0);

        Label polecenie5 = new Label("Podaj adres sprzedawcy:");
        polecenie5.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie5.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie5.setWrapText(true);
        polecenie5.setMaxWidth(500.0);

        Label polecenie6 = new Label("Podaj NIP sprzedawcy:");
        polecenie6.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie6.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie6.setWrapText(true);
        polecenie6.setMaxWidth(500.0);

        Label polecenie7 = new Label("Podaj nabywcę:");
        polecenie7.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie7.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie7.setWrapText(true);
        polecenie7.setMaxWidth(500.0);

        Label polecenie8 = new Label("Podaj adres nabywcy:");
        polecenie8.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie8.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie8.setWrapText(true);
        polecenie8.setMaxWidth(500.0);

        Label polecenie9 = new Label("Podaj NIP nabywcy:");
        polecenie9.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenie9.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenie9.setWrapText(true);
        polecenie9.setMaxWidth(500.0);

        TextArea dane1 = new TextArea();
        dane1.setFont(Font.font("Callibri", 25));
        dane1.setWrapText(true);
        dane1.setPrefRowCount(1);

        TextArea dane2 = new TextArea();
        dane2.setFont(Font.font("Callibri", 25));
        dane2.setWrapText(true);
        dane2.setPrefRowCount(1);

        TextArea dane3 = new TextArea();
        dane3.setFont(Font.font("Callibri", 25));
        dane3.setWrapText(true);
        dane3.setPrefRowCount(1);

        TextArea dane4 = new TextArea();
        dane4.setFont(Font.font("Callibri", 25));
        dane4.setWrapText(true);
        dane4.setPrefRowCount(1);

        TextArea dane5 = new TextArea();
        dane5.setFont(Font.font("Callibri", 25));
        dane5.setWrapText(true);
        dane5.setPrefRowCount(1);

        TextArea dane6 = new TextArea();
        dane6.setFont(Font.font("Callibri", 25));
        dane6.setWrapText(true);
        dane6.setPrefRowCount(1);

        TextArea dane7 = new TextArea();
        dane7.setFont(Font.font("Callibri", 25));
        dane7.setWrapText(true);
        dane7.setPrefRowCount(1);

        TextArea dane8 = new TextArea();
        dane8.setFont(Font.font("Callibri", 25));
        dane8.setWrapText(true);
        dane8.setPrefRowCount(1);

        TextArea dane9 = new TextArea();
        dane9.setFont(Font.font("Callibri", 25));
        dane9.setWrapText(true);
        dane9.setPrefRowCount(1);

        Button stworz = new Button("Stwórz fakturę");
        stworz.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        stworz.setMaxWidth(500);
        stworz.setMinWidth(500);
        stworz.setAlignment(Pos.CENTER);


        Label polecenieelementu1 = new Label("Podaj nazwę elementu:");
        polecenieelementu1.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenieelementu1.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenieelementu1.setWrapText(true);
        polecenieelementu1.setMaxWidth(500.0);

        Label polecenieelementu2 = new Label("Podaj wartość netto:");
        polecenieelementu2.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenieelementu2.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenieelementu2.setWrapText(true);
        polecenieelementu2.setMaxWidth(500.0);

        Label polecenieelementu3 = new Label("Podaj ilość:");
        polecenieelementu3.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenieelementu3.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenieelementu3.setWrapText(true);
        polecenieelementu3.setMaxWidth(500.0);

        Label polecenieelementu4 = new Label("Podaj VAT(w %):");
        polecenieelementu4.setFont(Font.font("Callibri", FontWeight.BOLD, 25));
        polecenieelementu4.setBackground(new Background(new BackgroundFill(Color.CORNSILK, null, null)));
        polecenieelementu4.setWrapText(true);
        polecenieelementu4.setMaxWidth(500.0);

        TextArea daneelementu1 = new TextArea();
        daneelementu1.setFont(Font.font("Callibri", 25));
        daneelementu1.setWrapText(true);
        daneelementu1.setPrefRowCount(1);

        TextArea daneelementu2 = new TextArea();
        daneelementu2.setFont(Font.font("Callibri", 25));
        daneelementu2.setWrapText(true);
        daneelementu2.setPrefRowCount(1);

        TextArea daneelementu3 = new TextArea();
        daneelementu3.setFont(Font.font("Callibri", 25));
        daneelementu3.setWrapText(true);
        daneelementu3.setPrefRowCount(1);

        TextArea daneelementu4 = new TextArea();
        daneelementu4.setFont(Font.font("Callibri", 25));
        daneelementu4.setWrapText(true);
        daneelementu4.setPrefRowCount(1);

        Button dodaj = new Button("Dodaj element");
        dodaj.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        dodaj.setMaxWidth(500);
        dodaj.setMinWidth(500);
        dodaj.setAlignment(Pos.CENTER);

        Button wyswietl = new Button("Wyświetl fakturę");
        wyswietl.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        wyswietl.setMaxWidth(500);
        wyswietl.setMinWidth(500);
        wyswietl.setAlignment(Pos.CENTER);
        
        VBox labele = new VBox(polecenie1,polecenie2,polecenie3,polecenie4,polecenie5,polecenie6,polecenie7,polecenie8,polecenie9);
        VBox polaTekstowe = new Vbox(dane1,dane2,dane3,dane4,dane5,dane6,dane7,dane8,dane9);
        HBox pola = new HBox(labele,polaTekstowe);
        VBox siatka1 = new VBox(pola,stworz);
        siatka1.setAlignment(Pos.TOP_CENTER);
        siatka1.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        siatka1.setPrefHeight(Screen.getPrimary().getVisualBounds().getHeight());
        Scene scenaStartowa = new Scene(siatka1);

        VBox lewaKolumna = new VBox(polecenieelementu1,polecenieelementu2,polecenieelementu3,polecenieelementu4,dodaj);
        VBox prawaKolumna = new VBox(daneelementu1,daneelementu2,daneelementu3,daneelementu4,wyswietl);
        HBox siatka2 = new HBox(lewaKolumna,prawaKolumna);
        siatka2.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        siatka2.setPrefHeight(Screen.getPrimary().getVisualBounds().getHeight());
        Scene scenaObslugi = new Scene(siatka2);

        baza.setScene(scenaStartowa);
        baza.setTitle("Zadanie 1.");
        baza.setMinHeight(Screen.getPrimary().getVisualBounds().getWidth());
        baza.setMinWidth(Screen.getPrimary().getVisualBounds().getWidth());
        baza.show();

        EventHandler<ActionEvent> tworzenie = new EventHandler<ActionEvent>()
        {
            @Override
            public void handle (ActionEvent event)
            {
                try
                {
                    int nipsprz = Integer.parseInt(dane6.getText());
                    try
                    {
                        int nipnab = Integer.parseInt(dane9.getText());
                        if (nipsprz>0 && nipnab>0 && czyText(dane1) && czyText(dane2) && czyText(dane3) && czyText(dane4) && czyText(dane5) && czyText(dane7) && czyText(dane8))
                        {
                            Osoba sprzedawca = new Osoba(dane4.getText(), dane5.getText(), nipsprz);
                            Osoba nabywca = new Osoba(dane7.getText(), dane8.getText(), nipnab);

                            faktura = new Faktura(dane1.getText(), dane2.getText(), dane3.getText(), sprzedawca, nabywca);
                            baza.setScene(scenaObslugi);
                        }
                    }
                    catch (Exception e){e.printStackTrace();}
                }
                catch (Exception e){e.printStackTrace();}
            }            
        };

        stworz.setOnAction(tworzenie);


        EventHandler<ActionEvent> dodawanieelementu = new EventHandler<ActionEvent>()
        {
            @Override
            public void handle (ActionEvent event)
            {
                try
                {
                    float netto = Float.parseFloat(daneelementu2.getText());
                    try
                    {
                        int ilosc = Integer.parseInt(daneelementu3.getText());
                        try
                        {
                            int vat = Integer.parseInt(daneelementu4.getText());
                            if (czyText(daneelementu1) && netto>0.0 && ilosc>0 && vat>=0)
                            {
                                Element produkt = new Element(daneelementu1.getText(), netto, ilosc, vat);
                                faktura.dodajElement(produkt);
                                daneelementu1.setText("");
                                daneelementu2.setText("");
                                daneelementu3.setText("");
                                daneelementu4.setText("");
                            }
                        }
                        catch (Exception e){e.printStackTrace();}
                    }
                    catch (Exception e){e.printStackTrace();}
                }
                catch (Exception e){e.printStackTrace();}
            }            
        };

        dodaj.setOnAction(dodawanieelementu);

        EventHandler<ActionEvent> wyswietlanie = new EventHandler<ActionEvent>()
        {
            @Override
            public void handle (ActionEvent event)
            {
                OknoWypisu wydruk = new OknoWypisu(faktura);
                wydruk.wypisz();
            }            
        };

        wyswietl.setOnAction(wyswietlanie);
    }
}
