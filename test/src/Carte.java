public class Carte {
    public String toString(){
        return "Carte: " + titlu + ", autor: " + autor;
    }
    public Carte(String titlu, String autor){
        this.titlu = titlu;
        this.autor = autor;
    }
    String titlu;
    String autor;
}
