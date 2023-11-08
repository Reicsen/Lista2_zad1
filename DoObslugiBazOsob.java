package main.java.com.lista2_zad1;

//Interfejs umożliwia podłączenie klasy/klas odpowiedzialnych za bazy danych, dzięki czemu
//nie wymaga to modyfikacji klasy faktura (zgodnie z open/close i zasadą wysokiej spójności).

public interface DoObslugiBazOsob
{
    String pobierzOsobe(Osoba o);
    String dodajOsobe(Osoba o);
}