package main.java.com.lista2_zad1;

public interface DoObslugiBazFaktur
{
    String wezInformacjeOFakturze(Faktura f);
    String wezProduktyFaktury(Faktura f);
    String wezNajnowszyProduktFaktury(Faktura f);
    String wezSumyFaktury(Faktura f);
}