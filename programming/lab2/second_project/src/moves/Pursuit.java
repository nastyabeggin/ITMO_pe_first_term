package moves;

import ru.ifmo.se.pokemon.*;

import static com.sun.javafx.fxml.expression.Expression.not;


public class Pursuit extends PhysicalMove {
    public Pursuit() {
        super(Type.DARK, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (!p.isAlive()) {
            p.setMod(Stat.HP, 40);
        }
    }

    @Override
    protected String describe() {
        return "uses Pursuit";
    }
}

