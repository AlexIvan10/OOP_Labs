import java.awt.*;

public class Autovehicul {
    private String marca;
    Color culoare;
    float vitezaCurenta;
    int trepteViteza;
    float vitezaMaxima;
    int trepteVitezaDisponibile;
    private Sofer sofer;
    float rezervor;
    float rezervorMax;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public float getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(float vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public void setTrepteViteza(int trepteViteza){
        this.trepteViteza = trepteViteza;
    }

    public int getTrepteViteza(){
        return trepteViteza;
    }

    public void setSofer(Sofer sofer){
        this.sofer = sofer;
    }

    public float getRezervor() {
        return rezervor;
    }

    public void setRezervor(float rezervor) {
        this.rezervor = rezervor;
    }

    public void accelerare(float delta){
        if(vitezaCurenta + delta > vitezaMaxima)
            vitezaCurenta = vitezaMaxima;
        else
            vitezaCurenta = vitezaCurenta + delta;
    }

    public void decelerare(float delta) {
        if (vitezaCurenta - delta < 0)
            vitezaCurenta = 0;
        else
            vitezaCurenta = vitezaCurenta - delta;
    }

    public void schimbareTrepteSus(int delta){
        if(trepteViteza + delta > trepteVitezaDisponibile)
            trepteViteza = trepteVitezaDisponibile;
        else
            trepteViteza++;
    }

    public void schimbareTrepteJos(int delta){
        if(trepteViteza - delta < 0)
            trepteViteza = 0;
        else
            trepteViteza--;
    }

    public void oprire(){
        vitezaCurenta = 0;
        trepteViteza = 0;
    }

    public void umpleRezervor(int delta){
        if(rezervor + delta > rezervorMax)
            rezervor = rezervorMax;
        else
            rezervor = rezervor + delta;
    }

    public void golireRezervor(){
        rezervor = 0;
    }
    public Autovehicul(String marca, Color culoare, float vitezaMaxima, int trepteVitezaDisponibile, float rezervorMax){
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaMaxima = vitezaMaxima;
        this.trepteVitezaDisponibile = trepteVitezaDisponibile;
        this.rezervorMax = rezervorMax;
    }

    public String toString(){
        return "Soferul " + sofer.getNume() + " are varsta " + sofer.varsta + " are numarul de permis " + sofer.nrPermis + " si conduce marca " + marca + " are viteza curenta de " + vitezaCurenta + " km/h si se afla in treapta " + trepteViteza + " si are rezervorul umplut cu " + rezervor + "l";
    }
}
