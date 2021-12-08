package calendar;

public class CalendarLucru {
    private Zi[] zile;

    public CalendarLucru() {
        this.zile = new Zi[]{
            new Zi("Luni", true),
            new Zi("Marti", true),
            new Zi("Miercuri", true),
            new Zi("Joi", true),
            new Zi("Vineri", true),
            new Zi("Sambata", false),
            new Zi("Duminica", false)
        };
    }

    public Zi[] getZile() {
        return zile;
    }

    public void setZile(Zi[] zile) {
        this.zile = zile;
    }

    // abordare semigrupa 2
    public int existaZi(String nume) {
        for(int i=0; i< zile.length; i++) {
            if(nume.equals(zile[i].getNume())) {
                return i;
            }
        }
        return -1;
    }
}