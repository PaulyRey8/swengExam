package Decorator;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class GunSniper extends GunDecorator {

    public GunSniper(Gun g){
        super(g);
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("I am a long range sniper rifle.");
    }
}
