package Decorator;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class GunDecorator implements Gun {

    protected Gun gun;

    public GunDecorator(Gun g) {
        this.gun = g;
    }

    public void describe() {
        this.gun.describe();
    }
}
