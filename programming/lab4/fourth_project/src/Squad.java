import java.util.Objects;

public  class Squad extends Person implements  ActionsOfSquads, Workable, Describable{
    private String[] actions = {"ничего не делает", null};

    public Squad(String name){
        super(name);
    }

    @Override
    public void work() {
        actions[0] = "занимается работой";
    }

    @Override
    public void additionalAction(String action){
        this.actions[1] = action;
    }

    @Override
    public boolean isBusy(){
        return !Objects.equals(this.actions[0], "ничего не делает");
    }

    @Override
    public String describe() {
        String for_return = "";
        for (String action : actions) {
            if (action != null) for_return += " Отряд " + action;
        }
        return for_return;
    }
}
interface ActionsOfSquads {
    void additionalAction(String action);
    boolean isBusy(); // возвращает занята ли команда
}