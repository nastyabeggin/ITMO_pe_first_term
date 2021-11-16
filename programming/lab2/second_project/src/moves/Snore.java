package moves;

import ru.ifmo.se.pokemon.*;

public class Snore extends SpecialMove {
    public Snore() {
        super(Type.NORMAL, 50, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3 && p.getCondition() == Status.SLEEP) {
            Effect.flinch(p);
            p.setMod(Stat.HP, 50);
        }
    }

    @Override
    protected String describe() {
        return "snores";
    }

}
