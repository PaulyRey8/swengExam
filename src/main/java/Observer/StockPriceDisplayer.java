package Observer;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class StockPriceDisplayer implements Observer{

    private Double paulStock;
    private Double danStock;
    private Double tobyStock;
    private Subject stockPriceTracker;

    public StockPriceDisplayer(Subject stockPriceTracker) {
        setSubject(stockPriceTracker);
    }

    public void update(Double paulStock, Double danStock, Double tobyStock) {
        this.paulStock = paulStock;
        this.danStock = danStock;
        this.tobyStock = tobyStock;

        printPrices();
    }

    public void setSubject(Subject sub) {
        stockPriceTracker = sub;
        stockPriceTracker.register(this);
    }

    public void printPrices(){
        System.out.println("Paul Stock : " + paulStock);
        System.out.println("Dan Stock : " + danStock);
        System.out.println("Toby Stock : " + tobyStock);
    }
}
