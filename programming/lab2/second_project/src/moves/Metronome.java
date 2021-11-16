package moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;


public class Metronome extends StatusMove {

    public Metronome() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.prepareMove();
        // problem solved
    }

    @Override
    protected String describe() {
        return "uses Metronome and chooses attack randomly";
    }

}
