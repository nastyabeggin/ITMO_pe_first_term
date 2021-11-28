import java.util.Arrays;

public class Thread implements Describable{
    String[] qualities = {"шелковые"};
    boolean are_unwound = false;

    public String describe() {
        String for_return = Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " нити";
        return for_return;
    }
}
