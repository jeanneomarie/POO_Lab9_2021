package wrongday;

public class ThrowExample {
    public void doIt() throws WrongDayException {
        int dayOfWeek = (new java.util.Date()).getDay();
        if (dayOfWeek != 1 && dayOfWeek != 4)
            throw new WrongDayException("Mon. or Thur.");
        System.out.println("Did it");
    }

    public void doIt2() {
        int dayOfWeek = (new java.util.Date()).getDay();
        if (dayOfWeek != 1 && dayOfWeek != 4)
            try {
                throw new WrongDayException("Mon. or Thur.");
            } catch (WrongDayException e) {
                e.printStackTrace();
                //return;
            } finally {
                System.out.println("finally got executed");
            }
        System.out.println("Did it");
    }

    public static void main(String[] argv) {
        (new ThrowExample()).doIt2();

//        try {
//            System.out.println("hello");
//            (new ThrowExample()).doIt();
//            System.out.println("bye");
//        } catch (WrongDayException e) {
//            System.out.println("Sorry, can do it only on " + e.getMessage());
//        } finally {
//            System.out.println("bye3");
//        }
//        System.out.println("bye2");
    }
}
