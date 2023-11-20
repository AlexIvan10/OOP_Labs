public class Autovehicul {
    Sofer sofer;
    double vitezaMaxima;
    double vitezaCurenta;
    public Autovehicul(){
    }
    Autovehicul(Sofer sofer){
        this.sofer = sofer;
    }
    void accelereaza(int delta){
        if(vitezaCurenta + delta > vitezaMaxima)
            vitezaCurenta = vitezaMaxima;
        else
            vitezaCurenta += vitezaMaxima;
    }
}
