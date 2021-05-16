abstract public class Consumable {
    protected String name;

    public Consumable(String name) {
        this.name = name;
    }

    public Consumable() {
        this.name = "Default";
    }

    public String getName() {
        return name;
    }

    abstract protected String consume();
}
