import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
     List<Fruta> inventario = new ArrayList<>();
     
     Fruta pera = new Pera();
     Fruta manzana = new Manzana();

     inventario.add(pera);
     inventario.add(manzana);

     for (Fruta fruta : inventario) {
        fruta.mostrarInfo();
     }
    }
}
