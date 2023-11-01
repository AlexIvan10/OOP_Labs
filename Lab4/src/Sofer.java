public class Sofer {
    private String nume;
    int varsta;
    char nrPermis;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public char getNrPermis() {
        return nrPermis;
    }

    public void setNrPermis(char nrPermis) {
        this.nrPermis = nrPermis;
    }

    public Sofer(String nume, int varsta, char nrPermis){
        this.nume = nume;
        this.varsta = varsta;
        this.nrPermis = nrPermis;
    }
}
