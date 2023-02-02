public interface Observable {
    void addObserver(ConcreteObserver observer);
    void deleteObserver(ConcreteObserver observer);
    void  notifyObserver(String nameVersion);
}
