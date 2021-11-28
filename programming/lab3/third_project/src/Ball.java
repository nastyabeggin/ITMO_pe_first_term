public class Ball implements Describable{ // шар
    boolean is_tied = false;
    Rope rope_tied_with = null;
    Bush bush_tied_to = null;
    boolean can_be_carried = true; // может ли быть унесен ветром
    String[] qualities = {"огромный"};


    public void tied(Rope rope, Bush bush) {
        is_tied = true;
        can_be_carried = false;
        rope_tied_with = rope;
        bush_tied_to = bush;
        rope.tied(bush_tied_to);
        bush.tied();
    }

    @Override
    public String describe() {
        String for_return = "";
        String action = is_tied ? "привязан" : "не привязан";
        for_return += "Шар " + action + bush_tied_to.describe() + " с помощью " +  rope_tied_with.describe();
        String action2 = can_be_carried ? "может быть унесен ветром" : "не может быть унесен ветром";
        for_return += ". Шар " + action2;
        return for_return;

    }
}
