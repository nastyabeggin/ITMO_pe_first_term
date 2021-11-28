import java.util.Arrays;

public class Basket implements Describable{
    String[] qualities = {"большая"};

    public String describe() {
        String for_return = Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " корзина";
        return for_return;
    }

}
