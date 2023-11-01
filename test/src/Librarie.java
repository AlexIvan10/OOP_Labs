public class Librarie {
    private int nrCarti = 0;
    private Carte[] listaCarti;
    public Librarie(int n) {
        listaCarti = new Carte[n];
    }
    public void adaugaCarte(Carte c){
        listaCarti[nrCarti] = c;
        nrCarti++;
    }
    public void afiseazaCarti(){
        for(int i = 0; i < nrCarti; i++){
            System.out.println(listaCarti[i]);
        }
    }
}
