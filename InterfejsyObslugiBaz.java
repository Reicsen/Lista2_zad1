package main.java.com.lista2_zad1;

public interface DoObslugiBazFaktur
{
    String wezInformacjeOFakturze(Faktura f);
    String wezProduktyFaktury(Faktura f);
}

public interface DoObslugiBazOsob
{
    String wezDaneSprzedajacego(Faktura f);
    String wezDaneNabywcy(Faktura f);
}