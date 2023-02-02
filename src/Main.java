public class Main {
    public static void main(String[] args) {
        ConcreteObserver personOne= new ConcreteObserver("Sergey");
        ConcreteObserver personTwo= new ConcreteObserver("Galina");
        ConcreteObserver personThree = new ConcreteObserver("Ganna ");
        ConcreteObservable observable = new ConcreteObservable();
        observable.addObserver(personOne);
        observable.addObserver(personTwo);
        observable.addObserver(personThree);
        observable.setСhangesVersion("Versio 1.1");
        observable.setСhangesVersion("Versio 1.2");


    }
}