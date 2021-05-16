public class Drink extends Consumable implements Edible {
    public Drink(String name) {
        super(name);
    }

    public String consume() {
        return "drinking";
    }

    public boolean isPoisonous() {
        return false;
    }
}
