
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class BubbleSort
{
    ArrayList<Integer>nums = new ArrayList<Integer>();

    public BubbleSort() {
        loadArrayList(100);
        bubbleSort(nums, nums.size());
    }

    public void loadArrayList(int n){
        for(int i = 0; i<n; i++){
            int rand = (int)(Math.random()*100);

            nums.add(rand);
        }
    }

    public void swap(ArrayList<Integer> numsList, int i, int j){
        int temp = numsList.get(i);

        numsList.get(i) = numsList.get(j);

        numsList.get(j) = temp;

    }

    public void bubbleSort(ArrayList<Integer> list, int n)  
    {  
        int i, j;  
        
        for (i = 0; i < n-1; i++)      

            for (j = 0; j < n-i-1; j++)  
                if (list.get(j) > list.get(j+1))  
                    swap(list, list.get(j), list.get(j+1));  
    } 

}
