public class FruitStore {
    private String myService;
    private Fruit myFruit;

    
    public FruitStore(String myService, Fruit myfruit){
        this.myService = myService;
        this.myFruit = myfruit;
    }
    
    void getService(){
        System.out.println(myService + " de "+ myFruit.getType());
    }
    
    /*public Fruit getmyFruit(){
        return myFruit;
    }

    public void setmyFruit(Fruit myFruit){
        this.myFruit = myFruit;
    }
        */
}
