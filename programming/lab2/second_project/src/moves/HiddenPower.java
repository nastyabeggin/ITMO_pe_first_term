package moves;
import ru.ifmo.se.pokemon.*;


public class HiddenPower extends SpecialMove {
    public HiddenPower() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    protected String describe() {
        return "uses Hidden Power";
    }
}
