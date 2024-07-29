public class Apple implements Fruit {
    private String type;

    public Apple(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return ("Manzana " + type);
    }

}
