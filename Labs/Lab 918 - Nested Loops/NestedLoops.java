
/**
 * Write a description of class NestedLoops here.
 *
 * @author (Peter Klopp)
 * @version (Lab 918)
 */
public class NestedLoops
{
    public NestedLoops()
    {

    }
    
    public static void problemA(){
        for(int r = 1; r <= 5; r++){
            for(int c = 0; c < r; c++){
                System.out.println(r);
            }
        }
    }
}
