package main.java.com.lista2_zad1;

//Interfejs metod związanych z wyświetlaniem umożliwia łatwe stworzenie osobnych klas robiących to
//w konkretny sposób (wysoka spójność) bez edycji pozostałych klas (open/close).

public interface Wydruki
{
    String wydrukDanych(Faktura f);
    String wydrukOsob (Faktura f);
    String wydrukElementu(Element e);
    String wydrukElementow(Faktura f);
    String wydrukSumy(Faktura f);
}