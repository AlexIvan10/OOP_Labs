public class TestGhiozdan {
    public static void main(String[] args){
        Ghiozdan g = new Ghiozdan();
        Caiet c1 = new Caiet("Mate");
        Caiet c2 = new Caiet("Geogra");
        Caiet c3 = new Caiet("Bio");
        Manual m1 = new Manual("Matematica");
        Manual m2 = new Manual("Geografie");

        g.add(c1);
        g.add(m1);
        g.add(m2);
        g.add(c2);
        g.add(c3);

        g.getNrRechizite();
        g.getNrManuale();
        g.getNrCaiete();
        System.out.println();
        
        g.listItems();
        g.listManual();
        g.listCaiet();
    }
}
