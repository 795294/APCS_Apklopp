
/**
 * Sorts an ArrayList of numbers in ascending order
 *
 * @author (Peter Klopp)
 * @version (Lab1017 - BubbleSort)
 */
import java.util.*;

public class BubbleSort
{
    

    public BubbleSort() {
        
    }

    public void loadArrayList(ArrayList<Integer> n, int x){
        for(int i = 0; i<x; i++){
            
            int rand = (int)(Math.random()*100);

            n.add(rand);
            
            System.out.print(n.get(i)+",");
        }
    }

    public void swap(ArrayList<Integer> y, int j){
        int temp = y.get(j+1);

        y.set(j+1, y.get(j));

        y.set(j,temp);

    }

    public void bubbleSort(ArrayList<Integer> x)  
    {  
        System.out.println("\nSorted list: ");
        
        for(int i= x.size(); i>=0; i--){
            for(int j = 0; j<i ;j++){
                if(j < i-1){
                    if(x.get(j) > x.get(j+1)){
                        swap(x,j);
                    }
                }
            }
        }

        for(int i = 0; i<x.size(); i++){
            System.out.print(x.get(i) + ",");
        }
    } 

}
