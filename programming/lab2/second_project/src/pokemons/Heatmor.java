package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Heatmor extends Pokemon {
    public Heatmor(String name, int level) {
        super(name, level);
        setStats(85, 97, 66, 105, 66, 65);
        setType(Type.FIRE);
        setMove(new MegaDrain(), new Snore(), new TakeDown(), new Pursuit());
    }
}
