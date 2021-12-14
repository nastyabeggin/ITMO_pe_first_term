import java.util.Arrays;

public class Bush implements Describable{
    boolean tied = false;
    private static String[] qualities = {"ореховый"};

    public void tied() {
        tied = true;
    }

    @Override
    public String describe() {
        String action = tied ? " к " + Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " куст" : "существовать";
        return action;
    }
}
