package pattern.Observer.custom;


public interface Subject {


    public void registerObserver(Observer o);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
