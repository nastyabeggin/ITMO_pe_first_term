import java.util.Arrays;

public class Net implements Describable {
    static String[] qualities = {"огромная"};

    public static class Thread {
        private static String[] qualities = {"шелковые"};
        boolean are_unwound = false;
        public static String pods_return = null;


        public static String describe() {
            return Arrays.toString(qualities).replace("[", "")
                    .replace("]", "") + " нити";
        }
    }

    public class Pods { // коконы
        String description_pods = Arrays.toString(Thread.qualities).replace("[", "").replace("]", "") + " коконы";
    }



    public String describe() {
        String for_return = Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " сетка" + " из " + Thread.describe();
        return for_return;
    }

    public String describe_thread() {
        return Thread.describe();
    }

    public String describe_pods() {
        Pods pods = new Pods();
        return pods.description_pods;
    }
}
