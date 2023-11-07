package main.java.com.lista2_zad1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Element 
{
    public static double zaokraglanie(double liczba)
    {
        BigDecimal pomocniczy = BigDecimal.valueOf(liczba);
        pomocniczy = pomocniczy.setScale(2, RoundingMode.HALF_UP);
        return pomocniczy.doubleValue();
    }

    public String nazwa;
    public double jednostkowanetto;
    public int ilosc;
    public int VAT;

    public double wartoscnetto;
    public double wartoscvat;
    public double wartoscbrutto;

    public Element(String nazw, double netto, int il, int v)
    {
        this.nazwa = nazw;
        this.jednostkowanetto = netto;
        this.ilosc = il;
        this.VAT = v;

        this.wartoscnetto = zaokraglanie(jednostkowanetto*ilosc);
        this.wartoscvat = zaokraglanie(wartoscnetto*0.01*VAT);
        this.wartoscbrutto = zaokraglanie(wartoscnetto + wartoscvat);
    }
}