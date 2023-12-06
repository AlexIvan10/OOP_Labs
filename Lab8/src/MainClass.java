public class MainClass {
    public static void main(String[] args) throws ExceptieZiNelucratoare{
        CalendarLucru c = new CalendarLucru();
        c.setZiLucratoare("Luni");
        c.setZiLucratoare("Marti");
        Lucrator l = new Lucrator("Gigel", c);
        l.lucreaza("Luni");
        l.lucreaza("Marte");
        l.lucreaza("Duminica");
        l.lucreaza("Marti");
        l.lucreaza("Miercuri");
    }
}
