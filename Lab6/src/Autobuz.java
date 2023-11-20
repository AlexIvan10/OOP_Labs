public class Autobuz extends Autovehicul{
    int ruta;
    Autobuz(int ruta){
        super(new Sofer());
        this.ruta = ruta;
    }
    void accelereaza(int delta){
        if(vitezaCurenta < vitezaMaxima)
            vitezaCurenta += delta;
    }
}
