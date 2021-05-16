public class Food extends Consumable implements Edible {
    public Food(String name) {
        this.name = name;
    }

    public String consume() {
        return "eating";
    }

    public boolean isPoisonous() {
        return false;
    }
}
