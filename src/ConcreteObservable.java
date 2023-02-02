import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable {
    private String nameVersion;

    List<ConcreteObserver> listObserver = new ArrayList<>();

    public ConcreteObservable() {
    }

    public void setСhangesVersion(String nameVersion) {
        notifyObserver(nameVersion);
    }

    @Override
    public void addObserver(ConcreteObserver observer) {
        listObserver.add(observer);
    }

    @Override
    public void deleteObserver(ConcreteObserver observer) {
        listObserver.remove(observer);
    }

    @Override
    public void notifyObserver(String nameVersion) {
        for (ConcreteObserver observer : listObserver) {
            observer.hendelMessage(nameVersion);
        }
    }
}
