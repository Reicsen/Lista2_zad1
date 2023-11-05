package main.java.com.lista2_zad1;

import java.util.List;

import com.lista2_zad1.Element;

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

        this.produkty = new List<>();
    }
}
