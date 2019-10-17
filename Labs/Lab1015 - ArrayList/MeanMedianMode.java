
/**
 * Return Mean+Median+Mode of ArrayList
 *
 * @author (Peter Klopp)
 * @version (Lab1015 - MMM)
 */

import java.util.ArrayList;
import java.util.Collections;

public class MeanMedianMode
{
    ArrayList<Integer>nums = new ArrayList<Integer>();
    
    public MeanMedianMode() {
        loadArrayList(100);
    }
    
    public void loadArrayList(int n){
        for(int i = 0; i<n; i++){
            int rand = (int)(Math.random()*100);
            
            nums.add(rand);
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
