package Factory;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class ChocolateCake extends Cake{
    private String topping;
    private String sponge;
    private String filling;

    public ChocolateCake(String topping, String sponge, String filling) {
        this.topping = topping;
        this.sponge = sponge;
        this.filling = filling;
    }

    @Override
    public String getTopping() {
        return topping;
    }

    @Override
    public String getSponge() {
        return sponge;
    }

    @Override
    public String getFilling() {
        return filling;
    }
}
