package Factory;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class CakeFactory {

    public static Cake getCake(String type, String topping, String sponge, String filling) {

        if("CHOCOLATE".equalsIgnoreCase(type))
            return new ChocolateCake(topping, sponge, filling);

        if("STRAWBERRY".equalsIgnoreCase(type))
            return new StrawberryCake(topping, sponge, filling);

        return null;
    }
}
