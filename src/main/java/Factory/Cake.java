package Factory;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public abstract class Cake {

    public abstract String getTopping();
    public abstract String getSponge();
    public abstract String getFilling();

    public void printCake(){
        System.out.println("This cake has a topping of " + getTopping() + "," +
                " a " + getSponge() + " flavoured sponge " +
                "and a filling of " + getFilling() + ".");
    }
}
