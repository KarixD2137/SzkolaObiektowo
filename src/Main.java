public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś","Kowalski",12);
        System.out.println(osobaJas.przedstawSie());
        //osobaJas.setImie("Jacek");
        //System.out.println(osobaJas.getImie());


        Osoba osobaIsia = new Osoba("Isia","Iksińska");
        System.out.println(osobaIsia.przedstawSie());


        Osoba osobaX = new Osoba();
        System.out.println(osobaX.przedstawSie());

        System.out.println(osobaIsia);
    }
}