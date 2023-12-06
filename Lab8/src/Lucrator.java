public class Lucrator {
    String nume;
    CalendarLucru calendarDeLucru;
    Lucrator(String nume, CalendarLucru calendarDeLucru){
        this.nume = nume;
        this.calendarDeLucru = calendarDeLucru;
    }
    public void lucreaza(String zi){
        int ok = 0;
        for (int i = 0; i < 7 && ok == 0; i++) {
            if(calendarDeLucru.calendar[i].getNume().equals(zi)){
                try{
                    calendarDeLucru.calendar[i].esteLucratoare();
                    ok = 1;
                    System.out.println("Lucratorul " + nume + " lucreaza " + zi);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    ok = 1;
                }
            }
        }
        if(ok == 0)
            System.out.println(zi + " nu este o zi a saptamanii");
    }
}
