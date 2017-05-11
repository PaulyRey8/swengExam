package Observer;

import java.util.ArrayList;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class StockPriceTracker implements Subject {

    private ArrayList<Observer> observers;

    private double paulStock;
    private double danStock;
    private double tobyStock;

    public StockPriceTracker() {
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObj) {
        observers.add(newObj);
    }

    public void unregister(Observer removeObj) {
        int index = observers.indexOf(removeObj);

        observers.remove(index);
    }

    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(paulStock, danStock, tobyStock);
        }
    }

    public void setPaulStock(double paulStock) {
        this.paulStock = paulStock;
        notifyObservers();
    }

    public void setDanStock(double danStock) {
        this.danStock = danStock;
        notifyObservers();
    }

    public void setTobyStock(double tobyStock) {
        this.tobyStock = tobyStock;
        notifyObservers();
    }
}
