package calendar;

public class Lucrator {
    private String nume;
    private CalendarLucru calendar;

    public Lucrator(String nume) {
        this.nume = nume;
        this.calendar = new CalendarLucru();
    }

    public void lucreaza(String numeZi) throws ExceptieZiNelucratoare {
        // abordare semigrupa 2
        int indexZi = this.calendar.existaZi(numeZi);
        if(indexZi == -1) {
            System.out.println(numeZi + " NU este o zi a saptamanii");
        } else {
            if(this.calendar.getZile()[indexZi].esteLucratoare())   {
                System.out.println("Lucratorul " + nume + " lucreaza " + numeZi);
            }
            else {
                throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
            }
        }

        // abordare semigrupa 1
        /*
        boolean gasita = false;
        for (int i = 0; i < this.calendar.getZile().length; i++) {
            Zi zi1 = this.calendar.getZile()[i];
            if (zi1.getNume().equals(numeZi)) {
                gasita = true;
                if (zi1.esteLucratoare())
                    System.out.println("Lucratorul " + nume + " lucreaza " + numeZi);
                else
                    throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
            }
        }
        if (!gasita) {
            System.out.println(numeZi + " NU este o zi a saptamanii");
        }*/
    }
}