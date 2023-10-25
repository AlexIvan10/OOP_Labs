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

    public float getRezervor() {
        return rezervor;
    }

    public void setRezervor(float rezervor) {
        this.rezervor = rezervor;
    }

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


    public void accelerare(float delta){
        if(this.vitezaCurenta + delta > this.vitezaMaxima)
            this.vitezaCurenta = vitezaMaxima;
        else
            this.vitezaCurenta = this.vitezaCurenta + delta;
    }

    public void decelerare(float delta) {
        if (this.vitezaCurenta - delta < 0)
            this.vitezaCurenta = 0;
        else
            this.vitezaCurenta = this.vitezaCurenta - delta;
    }

    public void schimbareTrepteSus(int delta){
        if(this.trepteViteza + delta > this.trepteVitezaDisponibile)
            this.trepteViteza = this.trepteVitezaDisponibile;
        else
            this.trepteViteza++;
    }

    public void schimbareTrepteJos(int delta){
        if(this.trepteViteza - delta < 0)
            this.trepteViteza = 0;
        else
            this.trepteViteza--;
    }

    public void oprire(){
        this.vitezaCurenta = 0;
        this.trepteViteza = 0;
    }

    public void umpleRezervor(int delta){
        if(this.rezervor + delta > this.rezervorMax)
            this.rezervor = this.rezervor;
        else
            this.rezervor = this.rezervor + delta;
    }

    public void golireRezervor(){
        this.rezervor = 0;
    }
    public Autovehicul(String marca, Color culoare, float vitezaMaxima, int trepteVitezaDisponibile, float rezervorMax){
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaMaxima = vitezaMaxima;
        this.trepteVitezaDisponibile = trepteVitezaDisponibile;
        this.rezervorMax = rezervorMax;
    }

    public String toString(){
        return "Soferul " + sofer.nume + " are varsta " + sofer.varsta + " are numarul de permis " + sofer.nrPermis + " si conduce marca " + marca + " are viteza curenta de " + vitezaCurenta + " si se afla in treapta " + trepteViteza + " si are rezervorul umplut cu " + rezervor + "l";
    }
}
