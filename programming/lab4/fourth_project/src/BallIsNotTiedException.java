public class BallIsNotTiedException extends RuntimeException { // unchecked exception. Привязан ли шар
    public BallIsNotTiedException(String message) {
        super(message);
    }
}
