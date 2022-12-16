package calendar;

public class Main {

    public static void main(String[] args) {
        Lucrator lucrator1 = new Lucrator("Andreea");
        try {
            lucrator1.lucreaza("Joi");
            lucrator1.lucreaza("Maine");
            lucrator1.lucreaza("Sambata");

        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }

        // conteaza ordinea exceptiilor
        Lucrator lucrator2 = null;
        try {
            lucrator2.lucreaza("Sambata");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Variabila lucrator este nula");
        }
    }
}
