import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Autovehicul auto = new Autovehicul("Dacia", Color.black, 250, 8, 60);
        Sofer sofer1 = new Sofer("Radu", 20, 'B');
        auto.setSofer(sofer1);

        System.out.println("Marca " + auto.getMarca());
        System.out.println("Culoare " + auto.getCuloare());
        System.out.println("Viteza curenta " + auto.getVitezaCurenta());
        auto.accelerare(30);
        auto.schimbareTrepteSus(1);
        auto.umpleRezervor(30);
        System.out.println(auto);
        auto.accelerare(400);
        auto.schimbareTrepteSus(10);
        System.out.println(auto);
        auto.decelerare(60);
        auto.schimbareTrepteJos(1);
        System.out.println(auto);
        auto.oprire();
        auto.golireRezervor();
        System.out.println(auto);
    }
}