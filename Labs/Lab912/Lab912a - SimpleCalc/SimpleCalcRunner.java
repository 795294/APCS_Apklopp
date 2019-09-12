
/**
 * Write a description of class SimpleCalcRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import static java.lang.System.*;

public class SimpleCalcRunner
{

    public SimpleCalcRunner()
    {
        
    }
    
    public static void main(){
        SimpleCalc simpleCalc = new SimpleCalc();
        
        out.println(simpleCalc.add(3,2));
        out.println(simpleCalc.subtract(3,2));
        out.println(simpleCalc.multiply(3,2));
        out.println(simpleCalc.divide(3,2));
        out.println(simpleCalc.moduloDivide(3,2));
        
    }
    
}
