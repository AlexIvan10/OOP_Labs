public class CalendarLucru {
    Zi[] calendar = new Zi[7];
    CalendarLucru(){
        for (int i = 0; i < calendar.length; i++) {
            calendar[i] = new Zi();
        }
        calendar[0].setNume("Luni");
        calendar[0].setNelucratoare();

        calendar[1].setNume("Marti");
        calendar[1].setNelucratoare();

        calendar[2].setNume("Miercuri");
        calendar[2].setNelucratoare();

        calendar[3].setNume("Joi");
        calendar[3].setNelucratoare();

        calendar[4].setNume("Vineri");
        calendar[4].setNelucratoare();

        calendar[5].setNume("Sambata");
        calendar[5].setNelucratoare();

        calendar[6].setNume("Duminica");
        calendar[6].setNelucratoare();
    }
    void setZiLucratoare(String nume){
        for (int i = 0; i < calendar.length; i++) {
            if(calendar[i].getNume().equals(nume)){
                calendar[i].setLucratoare();
                break;
            }
        }
    }
}
