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
        Uczen uczen4 = new Uczen("Kacper","Istelski", 17);

        System.out.println(uczen3.getNrEwidencyjny());
        ArrayList<String> przedmioty = new ArrayList<>();
        przedmioty.add("Informatyka");
        przedmioty.add("Programowanie stron internetowych");
        Nauczyciel nauczyciel = new Nauczyciel("Jarosław","Szkabarnicki",55, przedmioty);



        Klasa klasaP = new Klasa("3P", nauczyciel);
        klasaP.dodajUczniaDoKlasy(uczen1);
        klasaP.dodajUczniaDoKlasy(uczen2);
        klasaP.dodajUczniaDoKlasy(uczen3);

        Klasa klasaA = new Klasa("3A", nauczyciel);
        klasaA.dodajUczniaDoKlasy(uczen4);



        Szkola zs10 = Szkola.getSzkola();

        System.out.println(klasaA);
        System.out.println(klasaP);


        zs10.zmienKlaseUcznia(klasaA, uczen4, klasaP);
        System.out.println(klasaA);
        System.out.println(klasaP);

    }
}