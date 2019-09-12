
/**
 * Write a description of class DigitArray here.
 *
 * @author (Peter Klopp)
 * @version (Lab 912)
 */
public class DigitArray
{
    int num;
    int[] digits = new int[4];
    
    public DigitArray(int x)
    {
        num = x;
    }
    
    public void loadArray(){
        for(int i = 0; i<digits.length; i++){
           digits[i] = 
        }
    }
    
    public int[] getDigits(int n){
        int[] temp = new int[String.valueOf(n).length()]; //calculate length of digits
        
        int i = String.valueOf(n).length()-1; //intialize the value typo the last index
        
        while(n>0){
            temp[i];
            n = n/10;
            i--;
        }
        return temp;
    }

}
