
/**
 * Creates an array of numbers and calculates mean, median, and mode
 *
 * @author (Peter Klopp)
 * @version (Lab920)
 */
import static java.lang.System.*;

import java.util.Arrays;

public class ArrayClass
{
    int []nums = new int[100];
    
    public ArrayClass()
    {

    }
    
    public void loadArray(){
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*100) + 1;
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
    
    public double getMedian(){
        Arrays.sort(nums);
        
        return (nums[49]+nums[50])/2;
    }
    
    public int getMode(){
        int maxValue = 0, maxCount = 0;
 
        for (int i = 0; i < nums.length; ++i) 
        {
            int count = 0;
            
            for (int j = 0; j < nums.length; ++j) 
            {
                if (nums[j] == nums[i])
                    count++;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = nums[i];
            }
        }
 
        return maxValue;
    }
}
