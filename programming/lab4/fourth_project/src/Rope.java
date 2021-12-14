public class Rope implements Describable{ // веревка
    boolean is_tied = false;
    Bush bush_tied_to = null;

    public void tied(Bush our_bush) {
        is_tied = true;
        bush_tied_to = our_bush;
        our_bush.tied();
    }

    @Override
    public String describe() {
        String action = is_tied ? "привязана" : "не привязана";
        return "Веревка " + action + bush_tied_to.describe();
    }
}
