package moves;

import ru.ifmo.se.pokemon.*;

public class Fly extends PhysicalMove {
    public Fly() {
        super(Type.FLYING, 90, 95);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(1).stat(Stat.EVASION, 6);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Fly";
    }

}
