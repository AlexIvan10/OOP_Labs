public class Masina implements Cloneable, Comparable{
    String marca;
    int id;
    String culoare;
    public Masina(int id, String marca, String culoare){
        this.id = id;
        this.marca = marca;
        this.culoare = culoare;
    }
    public void revopseste(String culoare){
        this.culoare = culoare;
    }
    public String toString(){
        return marca + " " + culoare;
    }
    public Masina clone(){
        try{
            return (Masina) super.clone();
        }
        catch (Exception e) {
            System.out.println("Nu se poate");
            return null;
        }
    }
    public int compareTo(Object o){
        Masina temp = (Masina) o;
        return id - temp.id;
    }
}
