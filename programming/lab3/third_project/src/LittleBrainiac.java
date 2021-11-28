import java.util.Locale;

public class LittleBrainiac extends Person implements ActionsOfBrainiac, Workable, Describable { // знайка
    private String[] actions = {"ничего не делает", null};

    public LittleBrainiac(String name) {
        super(name);
    }


    public void refresh(){
        actions[0] = null;
    }

    @Override
    public void bind(Rope rope, Bush bush, Ball ball) {
        this.actions[0] = "привязывает";
        ball.tied(rope, bush); // шар становится привязанным
    }

    @Override
    public void order(Squad squad, OrderType type) {
        actions[0] = "велит " + type.name().toLowerCase(Locale.ROOT);
        squad.work();
        squad.additionalAction(type.name().toLowerCase(Locale.ROOT));
    }

    @Override
    public void separate(Babies babies, Squad squad1, Squad squad2) {
        actions[0] = "разделил";
        babies.are_separated = true;
        babies.squad1 = squad1;
        babies.squad2 = squad2;
    }

    @Override
    public void work() {
        actions[1] = "занимается работой";
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

interface ActionsOfBrainiac {
    void bind(Rope rope, Bush bush, Ball ball); // привязать. принимает на вход веревку, куст и шар
    void order(Squad squad, OrderType type); // велеть связанное с нитями
    void separate(Babies babies, Squad squad1, Squad squad2); // делит малышей на команды
    void refresh(); // очищает массив actions
}

interface Workable {
    void work(); // работать
}

interface Describable {
    String describe();
}

