public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś","Kowalski",12);
        System.out.println(osobaJas.przedstawSie());
        osobaJas.imie = "Jacek";
        System.out.println(osobaJas.przedstawSie());
    }
}