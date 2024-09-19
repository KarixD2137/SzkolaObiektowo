import java.util.ArrayList;

public class Szkola {

    // Konstruktor klasy singularnej
    private static Szkola szkola = new Szkola();

    private Szkola(){

    }


    private ArrayList<Uczen> uczniowie;
    private ArrayList<Klasa> klasy;

    public static Szkola getSzkola()
    {
        return szkola;
    }

    public void dodajUczniaDoSzkoly(Uczen uczen)
    {
        uczniowie.add(uczen);
    }

    public void dodajUczeniaDoSzkoly(String imie, String nazwisko, int wiek)
    {
        uczniowie.add(new Uczen(imie, nazwisko, wiek));
    }

    public void przypiszUczniaDoKlasy(Klasa klasa, Uczen uczen)
    {
        klasa.dodajUczniaDoKlasy(uczen);
    }

    public void zmienKlaseUcznia(Klasa klasaStara, Uczen uczen, Klasa klasaNowa)
    {
        klasaStara.usunUczniaZKlasy(uczen);
        klasaNowa.dodajUczniaDoKlasy(uczen);
    }

    @Override
    public String toString() {
        return "Szkola{" +
                "uczniowie=" + uczniowie +
                ", klasy=" + klasy +
                '}';
    }
}
