import java.util.ArrayList;

public class Klasa {
    private String numerKlasy;
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(String numerKlasy, Nauczyciel wychowawca) {
        this.numerKlasy = numerKlasy;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "numerKlasy='" + numerKlasy + '\'' +
                ", uczniowie=" + uczniowie +
                ", wychowawca=" + wychowawca +
                '}';
    }

    public void dodajUczniaDoKlasy(Uczen uczen)
    {
        if(uczniowie.contains(uczen))
        {
            System.out.println("Ten uczeń jest już dodany do tej klasy");
        }
        else
        {
            uczniowie.add(uczen);
        }
    }

    public void wypiszListeUczniow(){
        for (Uczen uczen : uczniowie)
        {
            System.out.println(uczen.getNrEwidencyjny() + ". " + uczen.getImie()  + " " + uczen.getNazwisko());
        }
    }
}
