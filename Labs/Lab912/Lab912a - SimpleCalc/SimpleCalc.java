
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (Peter Klopp)
 * @version (Lab912)
 */

public class SimpleCalc
{
   
    public SimpleCalc()
    {

    }
    
    public double add(double a, double b){
        return a+b;
    }
    
    public double subtract(double a, double b){
        return a-b;
    }
    
    public double multiply(double a, double b){
        return a*b;
    }
    
    public double divide(double a, double b){
        if(b != 0){
            return a/b;
        } else {
            return 9999999;
        }
    }
    
    public int moduloDivide(int a, int b){
        return a%b;
    }
}
