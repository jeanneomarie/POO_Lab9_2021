package calendar;

public class Lucrator {
    private String nume;
    private CalendarLucru calendar;

    public Lucrator(String nume) {
        this.nume = nume;
        this.calendar = new CalendarLucru();
    }

    public void lucreaza(String numeZi) throws ExceptieZiNelucratoare {
        boolean esteGasita = false;
        for (int i = 0; i < this.calendar.getZile().length; i++) {
            Zi zi1 = this.calendar.getZile()[i];
            if (zi1.getNume().equals(numeZi)) {
                esteGasita = true;
                if (zi1.esteLucratoare())
                    System.out.println("Lucratorul " + nume + " lucreaza " + numeZi);
                else
                    throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
            }
        }
        if (!esteGasita) {
            System.out.println(numeZi + " NU este o zi a saptamanii");
        }
    }
}
