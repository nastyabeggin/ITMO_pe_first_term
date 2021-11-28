public class Residents extends Person implements ActionsOfResidents, Describable {
    private String[] actions = {"ничего не делают", null};

    public Residents(String name) {
        super(name);
    }

    @Override
    public void come(){
        actions[0] = "приходили";
    }

    @Override
    public void watch(Ball ball){
        actions[1] = "смотрели на " + ball.describe();
    }

    @Override
    public void touch(Ball ball){
        actions[0] = "хотели потрогать шар";
    }

    @Override
    public void triedToLift(Ball ball){
        actions[0] = "пытались приподнять шар";
    }

    @Override
    public String describe() {
        String for_return = "";
        for (String action : actions) {
            if (action != null) for_return += " Жители " + action;
        }
        return for_return;
    }
}
interface ActionsOfResidents {
    void come();
    void watch(Ball ball);
    void touch(Ball ball);
    void triedToLift(Ball ball);
}