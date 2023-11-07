package main.java.com.lista2_zad1;

//Interfejs umożliwia podłączenie klasy/klas odpowiedzialnych za bazy danych, dzięki czemu
//nie wymaga to modyfikacji klasy faktura (zgodnie z open/close i zasadą wysokiej spójności).

public interface DoObslugiBazFaktur
{
    String wezInformacjeOFakturze(Faktura f);
    String wezProduktyFaktury(Faktura f);
    String wezNajnowszyProduktFaktury(Faktura f);
    String wezSumyFaktury(Faktura f);
}