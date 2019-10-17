
/**
 * Write a description of class MeanMedianMode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Collections;

public class MeanMedianMode
{
    ArrayList<Integer>nums;
    
    public void loadArrayList(){
        for(int i = 0; i<20; i++){
            nums.add((int)(Math.random()*100));
        }
    }
    
    public void printArrayList(){
        for(int i = 0; i<nums.size(); i++){
            System.out.print(nums.get(i)+",");
        }
    }
    
    public double getMean(){
        int sum = 0;
        
        for(int i = 0; i<nums.size(); i++){
            sum = sum + nums.get(i);
        }
        
        return sum/nums.size();
    }
    
    public double getMedian(){
        Collections.sort(nums);
        
        double middle = nums.size()/2;
        
        if (nums.size()%2 == 1) {
           middle = (nums.get(nums.size()/2) + nums.get(nums.size()/2 - 1))/2;
        } else {
           middle = nums.get(nums.size()/2);
        }
      return middle;
    }
    
    public int getMode(){
       int maxValue = 0, maxCount = 0;
       
       for(int i = 0; i<nums.size(); i++){
           int count = 0;
           
        for (int j = 0; j < nums.size(); ++j) 
         {
            if (nums.get(j) == nums.get(i)){
                count++;
            }
        }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = nums.get(i);
            }
        }
 
        return maxValue;
    
    }
}
