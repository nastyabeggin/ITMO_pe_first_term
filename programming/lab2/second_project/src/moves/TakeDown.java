package moves;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) Math.round(this.power * 1 / 4));
    }

    @Override
    protected String describe() {
        return "takes down";
    }
}
