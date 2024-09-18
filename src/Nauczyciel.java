import java.util.ArrayList;

public sealed class Nauczyciel extends Osoba implements Dyzurny permits Wychowawca{
    private ArrayList<String> przedmioty = new ArrayList<>();

    public Nauczyciel(String imie, String nazwisko, int wiek, ArrayList<String> przedmioty) {
        super(imie, nazwisko, wiek);
        this.przedmioty = przedmioty;
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Pilnowałem korytarza");
    }
}
