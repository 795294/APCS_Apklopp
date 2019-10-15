
/**
 * Write a description of class MeanMedianMode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

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
    
}
