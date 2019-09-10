
/**
 * Write a description of class ArrayClass here.
 *
 * @author (Peter Klopp)
 * @version (Lab920)
 */
import static java.lang.System.*;

public class ArrayClass
{
    int []nums = new int[100];
    
    public ArrayClass()
    {

    }
    
    public void loadArray(){
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10) + 1;
        }
    }
    
    public void printArray(){
        for(int i = 0; i<nums.length; i++){
            out.print(nums[i]+",");
        }
    }
    
    public int getSum(){
        
        int sum = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        
        return sum;
    }
    
    public double getMean(){
        int sum = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        
        return sum/nums.length;
    }
}
