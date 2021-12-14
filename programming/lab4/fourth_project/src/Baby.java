public class Baby extends Person implements Describable, Talkable {
    private String[] actions = {"ничего не делает", null};

    public Baby(String name) {
        super(name);
    }

    @Override
    public String describe() {
        String for_return = "";
        for (String action : actions) {
            if (action != null) for_return += " Знайка " + action;
        }
        return for_return;
    }
}
