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

    public double sumaNetto()
    {
        double sumanetto = 0.0;

        List<Element> listaelementow = this.produkty;

        for (int i=listaelementow.size()-1; i>=0; i--)
        {
            Element temp = listaelementow.get(i);
            sumanetto = sumanetto + temp.wartoscnetto;
        }
        return sumanetto;
    }

    public double sumaVAT()
    {
        double sumavat = 0.0;

        List<Element> listaelementow = this.produkty;

        for (int i=listaelementow.size()-1; i>=0; i--)
        {
            Element temp = listaelementow.get(i);
            sumavat = sumavat + temp.wartoscvat;
        }
        return sumavat;
    }

    public double sumaBrutto()
    {
        double sumabrutto = 0.0;

        List<Element> listaelementow = this.produkty;

        for (int i=listaelementow.size()-1; i>=0; i--)
        {
            Element temp = listaelementow.get(i);
            sumabrutto = sumabrutto + temp.wartoscbrutto;
        }
        return sumabrutto;
    }
}
