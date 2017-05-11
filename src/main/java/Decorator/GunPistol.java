package Decorator;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class GunPistol extends GunDecorator {

    public GunPistol(Gun g){
        super(g);
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("I am a short range portable pistol.");
    }
}
