package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Tangela extends Pokemon {
    public Tangela(String name, int level) {
        super(name, level);
        setStats(65, 55, 115, 100, 40, 60);
        setType(Type.GRASS);
        setMove(new Frustration(), new Fly(), new Metronome());
    }
}