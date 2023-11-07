package main.java.com.lista2_zad1;

public interface Wydruki
{
    String wydrukDanych(Faktura f);
    String wydrukOsob (Faktura f);
    String wydrukElementu(Element e);
    String wydrukElementow(Faktura f);
    String wydrukSumy(Faktura f);
}