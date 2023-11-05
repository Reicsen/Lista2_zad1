package main.java.com.lista2_zad1;

import java.util.List;

import com.lista2_zad1.Element;

public class Wydruk
{
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

    public String wydrukElementow(Faktura f)
    {
        List<Element> listaelementow = f.produkty;
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

    public String wydrukSumy (Suma s)
    {
        return "SUMA\nNetto: " + s.sumanetto + "\tVAT: " + s.sumavat + "\tBrutto: " + s.sumabrutto;
    }
}
