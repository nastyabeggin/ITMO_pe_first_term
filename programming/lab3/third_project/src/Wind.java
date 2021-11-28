import java.util.Arrays;

public class Wind implements WindActions, Describable{ // Ветер
    private String[] actions = {"есть", null};

    public void blow(boolean is_ball_tied) {
        actions[0] = "дует";
        if (is_ball_tied) actions[1] = "не может унести шар";
        else actions[1] = "может унести шар";
    }

    @Override
    public String describe() {
        String for_return = "";
        for (String action : actions) {
            if (action != null) for_return += " Ветер " + action;
        }
        return for_return;
    }
}

interface WindActions {
    void blow(boolean is_ball_tied); // дуть
}