import java.util.Arrays;

public class Crust implements Describable{
    String[] qualities = {"тонкая", "берёзовая"};

    public String describe() {
        String for_return = Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " кора";
        return for_return;
    }

}
