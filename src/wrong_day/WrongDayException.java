package wrong_day;

public class WrongDayException extends Exception {
    public WrongDayException() {
    }

    public WrongDayException(String msg) {
        super(msg);
    }
}