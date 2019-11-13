
/**
 * Quiz from 11/08/19
 *
 * @author (peter Klopp)
 * @version (1108)
 */

import java.util.*;

public class Quiz1108
{
   
    public Quiz1108()
    {
      
    }

    public ArrayList<Integer> makeList(int[] nums){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        
        for(int i =  0; i< nums.length; i++){
            newList.add(nums[i]);
        }
        
        return newList;
    }
    
    public int[] reverseList(ArrayList<Integer> nums){
        int[] reverseArray = new int[nums.size()];
        
        for(int i =  0; i< nums.size(); i++){
            reverseArray[i] = nums.get((nums.size()-1)-i);
        }
        
        return reverseArray;
    }
    
    public static void main(){
        
        int[] nums = {1,2,5,4,6};
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        
        numsList.add(1);
        numsList.add(2);
        numsList.add(3);
        numsList.add(4);
        numsList.add(5);
        
        
        Quiz1108 q = new Quiz1108();
        
        System.out.println(q.makeList(nums));
        System.out.println(q.reverseList(numsList));
    }
}
