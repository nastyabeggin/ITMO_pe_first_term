import java.util.Arrays;

public class Pods extends Thread implements Describable{ // коконы
    @Override
    public String describe() {
        String for_return = Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " коконы";
        return for_return;
    }
}
