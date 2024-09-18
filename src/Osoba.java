public class Osoba {
    public String imie;
    public String nazwisko;
    public int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    // Inwencja twórcza jak coś
    public String przedstawSie()
    {
        return "Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.";
    }
}
