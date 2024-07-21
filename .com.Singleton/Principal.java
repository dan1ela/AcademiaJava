public class Principal {
    public static void main(String[] args) {
        Inventario inv1 = Inventario.getInstance();
        Inventario inv2 = Inventario.getInstance();

        System.out.println("Cantidad inicial de peras y manzanas "+ Inventario.cantidadPeras + " " + Inventario.cantidadManzanas);

        Inventario.agregarPeras(10);
        Inventario.agregarManzanas(10);

        System.out.println("Cantidad después de añadir peras y manzanas "+ Inventario.cantidadPeras + " " + Inventario.cantidadManzanas);
        
        Inventario.agregarPeras(6);
        Inventario.agregarManzanas(4);

        System.out.println("Cantidad después de añadir peras y manzanas "+ Inventario.cantidadPeras + " " + Inventario.cantidadManzanas);
    }
}
