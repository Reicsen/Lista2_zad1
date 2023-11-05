package com.Lista2_zad1;

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
    public float jednostkowanetto;
    public int ilosc;
    public int VAT;

    public float wartoscnetto;
    public float wartoscvat;
    public float wartoscbrutto;

    public Element(String nazw, float netto, int il, int v)
    {
        this.nazwa = nazw;
        this.jednostkowanetto = netto;
        this.ilosc = il;
        this.VAT = v;

        this.wartoscnetto = zaokraglanie(jednostkowanetto*ilosc);
        this.wartoscvat = zaokraglanie((wartoscnetto/100.0)*VAT);
        this.wartoscbrutto = wartoscnetto + wartoscvat;
    }
}
