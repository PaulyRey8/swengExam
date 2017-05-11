package Observer;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public interface Observer {

    public void update(Double paulStock, Double danStock, Double tobyStock);

    public void setSubject(Subject sub);
}
