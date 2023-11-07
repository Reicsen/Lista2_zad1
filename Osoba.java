package main.java.com.lista2_zad1;

//Klasa jest odpowiedzialna jedynie za przechowywanie danych pojedynczej osoby, dzięki czemu
//nie musi tego robić klasa faktura, co zwiększa czytelność kodu i spójność.
//Ułatwia to też w razie potrzeby prostsze podłączenie nowych klas ,,niezainteresowanych" resztą
//faktury, co zwiększa czytelność oraz ułatwia zachowanie prawa Demeter i niskiego sprzężenia.

public class Osoba
{
    public String dane;
    public String adres;
    public int NIP;

    public Osoba(String nazwa, String adr, int nip)
    {
        this.dane = nazwa;
        this.adres = adr;
        this.NIP = nip;
    }
}
