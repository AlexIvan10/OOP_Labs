public class LibrarieDemo {
    public static void main(String[] args){
        System.out.println("Librarie demo");
        Carte c1 = new Carte("Luceafarul", "Mihai Eminescu");
        Carte c2 = new Carte("Harap-Alb", "Ion Creanga");
        Carte c3 = new Carte("Enigma Otiliei", "George Calinescu");
        Librarie lib = new Librarie(10);
        lib.adaugaCarte(c1);
        lib.adaugaCarte(c2);
        lib.adaugaCarte(c3);
        lib.afiseazaCarti();
    }
}
