package main.java.com.lista2_zad1;

import java.util.List;
import java.util.ArrayList;

public class Faktura
{
    public String numerfaktury;
    public String datasprzedazy;
    public String datawystawienia;
    public Osoba sprzedawca;
    public Osoba nabywca;

    List<Element> produkty;

    public Faktura(String nr, String sprzedaz, String wystawienie, Osoba sprz, Osoba nab)
    {
        this.numerfaktury = nr;
        this.datasprzedazy = sprzedaz;
        this.datawystawienia = wystawienie;
        this.sprzedawca = sprz;
        this.nabywca = nab;

        this.produkty = new ArrayList<>();
    }

    public void dodajElement(Element e)
    {
        this.produkty.add(e);
    }

    public String wydrukDanych()
    {
        return "Numer faktury: "+this.numerfaktury+"\nData sprzedaży: "+this.datasprzedazy+"\nData wystawienia: "+this.datawystawienia;
    }

    public String wydrukOsob()
    {
        Osoba sprz = this.sprzedawca;
        String tekstsprzedawcy = "Sprzedawca:\n"+sprz.dane+"\n"+sprz.adres+"\n"+sprz.NIP;
        Osoba nab = this.nabywca;
        String tekstnabywcy = "Nabywca:\n"+nab.dane+"\n"+nab.adres+"\n"+nab.NIP;
        return tekstsprzedawcy+"\n\n"+tekstnabywcy;
    }

    public String wydrukElementow()
    {
        List<Element> listaelementow = this.produkty;
        String wypis="";
        for (int i = listaelementow.size()-1; i >= 0; i--)
        {
            Element temp = listaelementow.get(i);
            wypis = wypis + temp.nazwa + "\t" + temp.nazwa + "x" + temp.jednostkowanetto + "PLN\tVAT: " + temp.VAT + "%\tBrutto: " + temp.wartoscbrutto + "PLN";
            if (i != 0)
            {
                wypis = wypis + "\n";
            }
        }
        return wypis;
    }

    public wydrukSumy()
    {
        float sumanetto = 0.0;
        float sumavat = 0.0;
        float sumabrutto = 0.0;

        List<Element> listaelementow = this.produkty;

        for (int i=listaelementow.size()-1; i>=0; i--)
        {
            Element temp = listaelementow.get(i);
            sumanetto = sumanetto + temp.wartoscnetto;
            sumavat = sumavat + temp.wartoscvat;
            sumabrutto = sumabrutto + temp.wartoscbrutto;
        }
        return "SUMA\nNetto: " + sumanetto + "\tVAT: " + sumavat + "\tBrutto: " + sumabrutto;
    }
}
