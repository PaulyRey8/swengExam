package Singleton;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class Kappa {

    private static final Kappa instance = new Kappa();

    private Kappa(){
        System.out.println("Only one of me can exist");
    }

    public static Kappa getInstance(){
        return instance;
    }

}
