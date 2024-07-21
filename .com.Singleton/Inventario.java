public class Inventario {
    private static Inventario myInv;
    static int cantidadPeras;
    static int cantidadManzanas;
    
    private Inventario(){
        cantidadPeras = 0;
        cantidadManzanas = 0;
    }
    
    public  static Inventario getInstance(){
        if( myInv == null){
            myInv = new Inventario();
            return myInv;
        }
        else
            return myInv;
    }

    public static void agregarPeras(int cantidad){
        cantidadPeras += cantidad;
    }

    public static void agregarManzanas(int cantidad){
        cantidadManzanas += cantidad;
    }
}
