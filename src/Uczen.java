public class Uczen extends Osoba implements Dyzurny{
    /*
    Uczen to klasa potomna
    Osoba to klasa bazowa
    Uczen dziedziczy wszystko (?) po klasie Osoba

     */
    private int nrEwidencyjny;
    static int liczbaObiektow = 0;
    // zmienna statyczna to jest wartośc klasy a nie obiektu


    // Wygenerowane z menu kontekstowego
    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek); // wywołujemy konstruktor
        liczbaObiektow++;
        this.nrEwidencyjny = liczbaObiektow;

    }

    public Uczen(String imie, String nazwisko, int wiek, int nrEwidencyjny) {
        super(imie,nazwisko);
        this.nrEwidencyjny = nrEwidencyjny;
    }

    @Override
    public String toString() {
        return "Uczen imie" + getImie() +
                "nrEwidencyjny=" + nrEwidencyjny +
                '}';
    }

    public int getNrEwidencyjny() {
        return nrEwidencyjny;
    }

    public void setNrEwidencyjny(int nrEwidencyjny) {
        this.nrEwidencyjny = nrEwidencyjny;
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Wytarłem tablicę");
    }
}
