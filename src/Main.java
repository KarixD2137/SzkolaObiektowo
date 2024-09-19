import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Osoba osobaJas = new Osoba("Jaś","Kowalski",12);
        //System.out.println(osobaJas.przedstawSie());
        //osobaJas.setImie("Jacek");
        //System.out.println(osobaJas.getImie());


        // osobaIsia = new Osoba("Isia","Iksińska");
        //System.out.println(osobaIsia.przedstawSie());


        //Osoba osobaX = new Osoba();
        //System.out.println(osobaX.przedstawSie());

        //System.out.println(osobaIsia);


        Uczen uczen1 = new Uczen("Karol","Kopczyński", 16);
        System.out.println(uczen1.getNrEwidencyjny());
        Uczen uczen2 = new Uczen("Adam","Krzak", 16);
        System.out.println(uczen2.getNrEwidencyjny());
        Uczen uczen3 = new Uczen("Łukasz","Jurkiewicz", 17);
        System.out.println(uczen3.getNrEwidencyjny());
        ArrayList<String> przedmioty = new ArrayList<>();
        przedmioty.add("Fizyka");
        przedmioty.add("Matematyka");
        Nauczyciel nauczyciel = new Nauczyciel("Ryszard","Siedlarz",45, przedmioty);
        Klasa klasaP = new Klasa("3P", nauczyciel);
        klasaP.dodajUczniaDoKlasy(uczen1);
        klasaP.dodajUczniaDoKlasy(uczen2);
        klasaP.dodajUczniaDoKlasy(uczen3);
        klasaP.dodajUczniaDoKlasy(uczen3);
        klasaP.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasaP);
    }
}