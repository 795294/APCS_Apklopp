
/**
 * Write a description of class Pumpkin here.
 *
 * @author (Peter Klopp)
 * @version (Lab823)
 */
public class Pumpkin
{
    private double rad;
    private int id;
    
    public Pumpkin(double r, int id){
        rad = r;
        this.id = id;
    }
    
    public double getRadius(){
        return rad;
    }
    
    public int getId(){
        return id;
    }

}
