package main.java.com.lista2_zad1;

import java.util.List;

public class Suma
{
    public float sumanetto;
    public float sumavat;
    public float sumabrutto;

    public Suma(List<Element> produkty)
    {
        this.sumanetto = 0.0;
        this.sumavat = 0.0;
        this.sumabrutto = 0.0;

        for (int i=produkty.size()-1; i>=0; i--)
        {
            Element temp = produkty.get(i);
            sumanetto = sumanetto + temp.wartoscnetto;
            sumavat = sumavat + temp.wartoscvat;
            sumabrutto = sumabrutto + temp.wartoscbrutto;
        }
    }

    public String wydrukSumy ()
    {
        return "SUMA\nNetto: " + this.sumanetto + "\tVAT: " + this.sumavat + "\tBrutto: " + this.sumabrutto;
    }
}
