import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p2 = new Tangela("Vanya", 18);
        Pokemon p3 = new Gloom("Dima", 18);
        Pokemon p1 = new Heatmor("Darya", 18);
        Pokemon p4 = new Vileplume("Nastya", 18);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addFoe(p2);
        b.addFoe(p3);
        b.go();
    }
}
