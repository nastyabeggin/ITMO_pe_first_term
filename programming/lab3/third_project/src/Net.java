import java.util.Arrays;

public class Net implements Describable{
    String[] qualities = {"огромная"};

    public String describe() {
        String for_return = Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " сетка";
        return for_return;
    }
}
