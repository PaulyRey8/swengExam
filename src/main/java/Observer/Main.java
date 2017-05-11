package Observer;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        StockPriceTracker spt = new StockPriceTracker();

        Observer one = new StockPriceDisplayer(spt);
        spt.setPaulStock(100.00);
        spt.setDanStock(50.12);
        spt.setTobyStock(69.69);

        Observer two = new StockPriceDisplayer(spt);
        spt.setPaulStock(100.00);
        spt.setDanStock(50.12);
        spt.setTobyStock(69.69);

        Observer three = new StockPriceDisplayer(spt);
        spt.setPaulStock(100.00);
        spt.setDanStock(50.12);
        spt.setTobyStock(69.69);

    }
}
