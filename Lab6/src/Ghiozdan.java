public class Ghiozdan {
    Rechizita[] lista = new Rechizita[10];
    private static int nrLucruri = 0;
    public void add(Caiet caiet){
        lista[nrLucruri++] = caiet;
    }
    public void add(Manual manual){
        lista[nrLucruri++] = manual;
    }
    public void listItems(){
        System.out.println("Toate rechizitele din ghiozdan");
        for(int i = 0; i < nrLucruri; i++)
            System.out.println(lista[i].getEticheta());
        System.out.println();
    }
    public void listManual(){
        System.out.println("Toate manualele din ghiozdan");
        for(int i = 0; i < nrLucruri; i++){
            if(lista[i] instanceof Manual)
                System.out.println(lista[i].getEticheta());
        }
        System.out.println();

    }
    public void listCaiet(){
        System.out.println("Toate caietele din ghiozdan");
        for (int i = 0; i < nrLucruri; i++) {
            if(lista[i] instanceof Caiet)
                System.out.println(lista[i].getEticheta());
        }
        System.out.println();

    }
    public void getNrRechizite(){
        System.out.println("Sunt " + nrLucruri + " rechizite");
    }
    public void getNrManuale(){
        int nr = 0;
        for (int i = 0; i < nrLucruri; i++) {
            if(lista[i] instanceof Manual)
                nr++;
        }
        System.out.println("Sunt " + nr + " manuale");
    }
    public void getNrCaiete(){
        int nr = 0;
        for (int i = 0; i < nrLucruri; i++) {
            if(lista[i] instanceof Caiet)
                nr++;
        }
        System.out.println("Sunt " + nr + " caiete");
    }
}
