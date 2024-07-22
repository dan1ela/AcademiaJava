public abstract class FrutaBase implements Fruta {
    protected String nombre;
    protected String color;

    public FrutaBase(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + ", Color: " + getColor());
    }
}
