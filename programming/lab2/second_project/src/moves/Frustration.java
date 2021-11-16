package moves;

import ru.ifmo.se.pokemon.*;

public class Frustration extends PhysicalMove {
    public Frustration() {
        super(Type.NORMAL, 74, 100);
    }

    @Override
    protected String describe() {
        return "uses Frustration";
    }
}
