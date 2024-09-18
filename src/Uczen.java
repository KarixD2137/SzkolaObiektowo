public class Uczen extends Osoba{
    /*
    Uczen to klasa potomna
    Osoba to klasa bazowa
    Uczen dziedziczy wszystko (?) po klasie Osoba

     */
    private int nrEwidencyjny;


    // Wygenerowane z menu kontekstowego
    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek); // wywołujemy konstruktor
    }

    public Uczen(String imie, String nazwisko, int wiek, int nrEwidencyjny) {
        super(imie,nazwisko);
        this.nrEwidencyjny = nrEwidencyjny;
    }
}
