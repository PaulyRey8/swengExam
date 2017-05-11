package Factory;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Cake cake = CakeFactory.getCake("chocolate", "milk chocolate", "dark chocolate", "white chocolate");
        System.out.println(cake.getClass());
        cake.printCake();

    }
}
