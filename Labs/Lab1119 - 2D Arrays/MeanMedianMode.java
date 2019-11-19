
/**
 * Fiingds mean, median, and mode of 2d arrays
 *
 * @author (Peter Klopp)
 * @version (11/19/19)
 */

import java.util.*;

public class MeanMedianMode
{

    public MeanMedianMode()
    {

    }

    public int[][] loadArray(){
        int[][] mat = new int[10][10];

        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                mat[r][c] = ((int)(Math.random()*9))+1;
            }
        }

        return mat;
    }

    public void printArray(int mat[][]){

        System.out.println(Arrays.deepToString(mat));

    }

    public double findRowAvg(int mat[][]) {
        int sum = 0;
        double average = 0;

        for (int r = 0; r < mat.length; r++){

            for (int c = 0; c < mat[r].length; c++){
                sum += mat[r][c];
            }

            average = sum / mat[r].length;
            System.out.println(average);
            sum = 0;
        }

        return average;

    }

    public int findRowMiddle(int mat[][]){
        int middle = 0;
        
        for (int r = 0; r < mat.length; r++){

            for (int c = 0; c < mat[r].length; c++){
                
                middle = mat[r][mat[r].length/2];
                
            }
            
        }
        
        return middle;

    }

    public int[][] sort(int mat[][])  
    {  

        for(int k = 0; k<mat.length; k++){

            for(int i = 0; i<mat[k].length ;i++){

                for(int j = i + 1; j < mat[k].length; j++)

                    if(mat[k][i] > mat[k][j]){
                        
                        int temp = mat[k][i];
                        
                        mat[k][i] = mat[k][j];
                        
                        mat[k][j] = temp;
                        
                    }
            }
        }
        
        System.out.println(Arrays.deepToString(mat));
        
        return mat;
    }

    
    public static void main(){
        MeanMedianMode mmm = new MeanMedianMode();

        int[][] mat = mmm.loadArray();

        mmm.printArray(mat);

        System.out.println(mmm.findRowAvg(mat));
        
        mmm.sort(mat);
        
        System.out.println(mmm.findRowMiddle(mmm.sort(mat)));
        

    }

}
