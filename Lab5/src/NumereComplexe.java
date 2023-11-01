public class NumereComplexe {
    private int parteReala, parteImaginara;
    public NumereComplexe(int parteReala, int parteImaginara){
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }
    public NumereComplexe adunare(NumereComplexe b){
        NumereComplexe rezultat = new NumereComplexe(0, 0);
        rezultat.parteReala = parteReala + b.parteReala;
        rezultat.parteImaginara = parteImaginara + b.parteImaginara;
        return rezultat;
    }

    public NumereComplexe scadere(NumereComplexe b){
        NumereComplexe rezultat = new NumereComplexe(0, 0);
        rezultat.parteReala = parteReala - b.parteReala;
        rezultat.parteImaginara = parteImaginara - b.parteImaginara;
        return rezultat;
    }

    public NumereComplexe inmultire(NumereComplexe b){
        NumereComplexe rezultat = new NumereComplexe(0, 0);
        rezultat.parteReala = parteReala * b.parteReala - parteImaginara * b.parteImaginara;
        rezultat.parteImaginara = parteReala * b.parteImaginara + parteImaginara * b.parteReala;
        return rezultat;
    }

    public NumereComplexe inmultireScalar(int a){
        NumereComplexe rezultat = new NumereComplexe(0, 0);
        rezultat.parteReala = parteReala * a;
        rezultat.parteImaginara = parteImaginara * a;
        return rezultat;
    }

    public String toString() {
        if(parteReala == 0 && parteImaginara == 0)
            return "0";
        else if(parteReala == 0)
            return parteImaginara + "i";
        else if(parteImaginara == 0)
            return Integer.valueOf(parteReala).toString();
        else if (parteImaginara > 0)
            return parteReala + "+" + parteImaginara + "i";
        else
            return parteReala + "" + parteImaginara + "i";
    }
}
