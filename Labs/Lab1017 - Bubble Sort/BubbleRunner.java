
/**
 * Sorts an ArrayList of numbers in ascending order
 *
 * @author (Peter Klopp)
 * @version (Lab1017 - BubbleSort)
 */
import java.util.*;

public class BubbleRunner
{
    public static void main(){
        
        ArrayList<Integer>nums = new ArrayList<Integer>();
        
        BubbleSort list = new BubbleSort();
        
        list.loadArrayList(nums, 1000);
        
        list.bubbleSort(nums);
        
    }
}
