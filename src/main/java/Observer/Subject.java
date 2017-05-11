package Observer;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public interface Subject {

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}
