public class Zi{
    String ziua;
    boolean lucratoare;
    public void setNume(String nume){
        ziua = nume;
    }
    public String getNume(){
        return ziua;
    }
    public void setLucratoare(){
        lucratoare = true;
    }
    void setNelucratoare(){
        lucratoare = false;
    }
    void esteLucratoare() throws ExceptieZiNelucratoare{
        if(!lucratoare)
            throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
    }
}
