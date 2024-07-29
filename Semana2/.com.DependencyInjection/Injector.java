public class Injector{

    static FruitStore getService(){
        Fruit myFruit = new Apple("Cider");
        return new FruitStore("Se ha creado un servicio", myFruit);
    }
}
