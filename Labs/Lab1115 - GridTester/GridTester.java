
/**
 * 2d array practcce
 *
 * @author (Peter Klopp)
 * @verscon (Lab1115)
 */

import java.util.*;
public class GridTester
{
    
    public GridTester()
    {
        
    }
    
    public int[][] loadArray(){
        int mat[][] = new int[10][10];
        
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c<mat[r].length; c++){
                mat[r][c] = (int)(Math.random()*100);
            }
        }
        
        return mat;
    }
    
    public void printArray(int mat[][]){

        System.out.println(Arrays.deepToString(mat));
        
    }
    
    public int sumAll(int mat[][]){
        int sum = 0;
        
        for(int r = 0; r<mat.length; r++){
            for(int c = 0; c<mat[r].length; c++){
                sum += mat[r][c];
            }
        }
        
        return sum;
    }
    
    public int findGreatest(int mat[][]){
        int maxValue = mat[0][0];
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                if (mat[r][c] > maxValue){
                    maxValue = mat[r][c];
                }
            }
        }
        return maxValue;
    }
    
    public int numberOfGreatest(int mat[][], int maxValue){
       
        int numGreatest = 0;
        
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                if (mat[r][c] == maxValue){
                    numGreatest++;
                }
            }
        }
        
        return numGreatest;
       
    }

    
    public static void main(){
        GridTester gt = new GridTester();
        
        int[][] mat = gt.loadArray();
        
        gt.printArray(mat);
        
        System.out.println(gt.sumAll(mat));
        
        System.out.println(gt.findGreatest(mat));
        
        System.out.println(gt.numberOfGreatest(mat, gt.findGreatest(mat)));
        
        
    }
}
