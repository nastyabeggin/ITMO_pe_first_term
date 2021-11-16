package moves;

import ru.ifmo.se.pokemon.*;

public class LeechSeed extends StatusMove {
    private int new_hp;

    public LeechSeed() {
        super(Type.GRASS, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        new_hp = (int) (p.getHP() * 1 / 8);
        Effect e = new Effect().turns(-1).stat(Stat.HP, new_hp);
        p.addEffect(e);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(-1).stat(Stat.HP, -1 * new_hp);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Leech Seed";
    }
}
