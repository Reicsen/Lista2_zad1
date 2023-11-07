package main.java.com.lista2_zad1;

import java.util.List;
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

//Dodatkowa klasa spoza modelu dziedziny (zgodnie z zasadą czysty wymysł) odpowiedzialna jedynie 
//za wyświetlanie graficzne faktury, mająca na celu zwiększyć spójność poprzez odciążenie klienta
//z tych odpowiedzialności.
//W definicjach metod z interfejsu unikane są wyrażenia typu obiekt.metoda1().metoda2()... (prawo Demeter).

public class OknoWypisu implements Wydruki
{
    public Faktura faktura;

    public OknoWypisu(Faktura f)
    {
        this.faktura = f;
    }

    public String wydrukDanych(Faktura f)
    {
        return "Numer faktury: "+f.numerfaktury+"\nData sprzedaży: "+f.datasprzedazy+"\nData wystawienia: "+f.datawystawienia;
    }

    public String wydrukOsob(Faktura f)
    {
        Osoba sprz = f.sprzedawca;
        String tekstsprzedawcy = "Sprzedawca:\n"+sprz.dane+"\n"+sprz.adres+"\n"+sprz.NIP;
        Osoba nab = f.nabywca;
        String tekstnabywcy = "Nabywca:\n"+nab.dane+"\n"+nab.adres+"\n"+nab.NIP;
        return tekstsprzedawcy+"\n\n"+tekstnabywcy;
    }

    public String wydrukElementu(Element e)
    {
        return e.nazwa + "\t\t" + e.ilosc + "x" + e.jednostkowanetto + "PLN\t\tVAT: " + e.VAT + "%\t\tBrutto: " + e.wartoscbrutto + "PLN";
    }

    public String wydrukElementow(Faktura f)
    {
        List<Element> listaelementow = f.produkty;
        String wypis="";
        for (int i = listaelementow.size()-1; i >= 0; i--)
        {
            Element temp = listaelementow.get(i);
            wypis = wypis + wydrukElementu(temp);
            if (i != 0)
            {
                wypis = wypis + "\n";
            }
        }
        return wypis;
    }

    public String wydrukSumy(Faktura f)
    {
        return "SUMA\nNetto: " + f.sumaNetto() + "\tVAT: " + f.sumaVAT() + "\tBrutto: " + f.sumaBrutto();
    }

    public void wypisz()
    {
        Label infoglowne = new Label(wydrukDanych(this.faktura));
        infoglowne.setFont(Font.font("Callibri",FontWeight.BOLD,25));
        infoglowne.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infoglowne.setWrapText(true);
        infoglowne.setMaxWidth(Double.POSITIVE_INFINITY);

        Label infoosob = new Label(wydrukOsob(this.faktura));
        infoosob.setFont(Font.font("Callibri",FontWeight.BOLD,20));
        infoosob.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infoosob.setWrapText(true);
        infoosob.setMaxWidth(Double.POSITIVE_INFINITY);

        Label infoproduktow = new Label(wydrukElementow(this.faktura));
        infoproduktow.setFont(Font.font("Callibri",FontWeight.BOLD,15));
        infoproduktow.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infoproduktow.setWrapText(true);
        infoproduktow.setMaxWidth(Double.POSITIVE_INFINITY);

        Label infosumy = new Label(wydrukSumy(this.faktura));
        infosumy.setAlignment(Pos.CENTER);
        infosumy.setFont(Font.font("Callibri",FontWeight.BOLD,20));
        infosumy.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        infosumy.setWrapText(true);
        infosumy.setMaxWidth(Double.POSITIVE_INFINITY);

        Stage okno = new Stage();
        VBox siatka = new VBox(infoglowne,infoosob,infoproduktow,infosumy);
        Scene scena = new Scene(siatka);
        okno.setTitle("Zadanie 1.");
        siatka.setPrefWidth(Screen.getPrimary().getVisualBounds().getWidth());
        siatka.setPrefHeight(Screen.getPrimary().getVisualBounds().getHeight());
        okno.setScene(scena);
        okno.setMinHeight(Screen.getPrimary().getVisualBounds().getWidth());
        okno.setMinWidth(Screen.getPrimary().getVisualBounds().getWidth());
        okno.show();
    }
}
