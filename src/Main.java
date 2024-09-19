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
        Uczen uczen2 = new Uczen("Adam","Krzak", 16);
        Uczen uczen3 = new Uczen("Łukasz","Jurkiewicz", 17);
        Uczen uczen4 = new Uczen("Kacper","Istelski", 17);

        ArrayList<String> przedmioty = new ArrayList<>();
        przedmioty.add("Informatyka");
        przedmioty.add("Programowanie stron internetowych");
        Nauczyciel nauczyciel1 = new Nauczyciel("Jarosław","Szkabarnicki",55, przedmioty);

        przedmioty.add("Matematyka");
        przedmioty.add("Informatyka");
        przedmioty.add("Programowanie stron internetowych");
        Nauczyciel nauczyciel2 = new Nauczyciel("Martyna","Dudek",40, przedmioty);



        Klasa klasaP = new Klasa("3P", nauczyciel1);
        klasaP.dodajUczniaDoKlasy(uczen1);
        klasaP.dodajUczniaDoKlasy(uczen2);
        klasaP.dodajUczniaDoKlasy(uczen3);

        Klasa klasaA = new Klasa("3A/E", nauczyciel2);
        klasaA.dodajUczniaDoKlasy(uczen4);



        Szkola zs10 = Szkola.getSzkola();

        System.out.println(klasaA);
        System.out.println(klasaP);


        zs10.zmienKlaseUcznia(klasaA, uczen4, klasaP);
        System.out.println(klasaA);
        System.out.println(klasaP);

    }
}