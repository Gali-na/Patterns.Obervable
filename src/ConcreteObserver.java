public class ConcreteObserver implements Observer{
    private  String namePerson;

    public ConcreteObserver(String namePerson) {
        this.namePerson = namePerson;
    }

    public void hendelMessage(String message) {
        System.out.println( namePerson +"got information aboun new version " + message);
    }
}
