package moves;

import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove{
    public TeeterDance(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }

    @Override
    public String describe() {
        return "throws Teeter Dance";
    }
}
