package wrong_day;

public class ThrowExample {
    public void doIt() throws WrongDayException {
        int dayOfWeek = (new java.util.Date()).getDay();
        if (dayOfWeek != 2 && dayOfWeek != 4)
            throw new WrongDayException("Tue. or Thur.");
        System.out.println("Did it");
    }

    public static void main(String[] argv) {
        try {
            System.out.println("hello");
            (new ThrowExample()).doIt();
            System.out.println("bye");
        } catch (WrongDayException e) {
            System.out.println("Sorry, can do it only on " + e.getMessage());
            e.printStackTrace();
        }
    }
}
