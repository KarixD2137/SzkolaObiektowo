import java.util.Scanner;

public class Osoba {

    // Hermetyzacja
    // modyfikator dostępu public, private, protected
    private String imie;
    private String nazwisko;
    private int wiek;

    // Konstruktor
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

    // Metody dotępowe
    // gettery i settery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //zabezpieczenia przed niepożądaną zmianą
        System.out.println("Podaj hasło:");
        Scanner klawiatura = new Scanner(System.in);
        String haslo = klawiatura.next();
        if(haslo.equals("qwe123")) // UWAGA! haslo == "qwe123" nie będzie działać bo string to obiekt
        {
            this.imie = imie;
        }
        else
        {
            System.out.println("Błędne hasło");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
