
/**
 * Write a description of class Exam1Corrections here.
 *
 * @author (Peter Klopp)
 * @version (Exam 1 Corrections)
 */
public class Exam1Corrections
{
   public static void problem2(){
       int num = 4%47 + 10%3 +15/4;
       
       System.out.println("Problem 2 Output:" + num);
       
       //Remainder of 4/47 is 4
       //Remainder of 10/3 is 1
       //15/4 expressed as an integer is 3
       //4+1+3 = 8
    }
    
   public static void problem4(){
       int num = 4;
       if(num/3 <= 1){
           System.out.print("true");
        }
        System.out.print("false");
        
    //This problem will always print false regardless of whether or not
    //the first condition is true
    //4/3 expressed as an integer is 1, so that condition is true
    //Therefore, the output will be "truefalse"
    }
    
    public static void problem6(){
        
        //Given an array "evens"
        int i = 0;
        int evens = 0;
        while(i<4){
            evens+=2;
            i++;
            
            //evens[i] = evens; (loads the evens array)
            
            System.out.println(evens);
        }
        
    }
    
    public static void problem9(){
        for(int i = 0; i<4; i++){
            
        }
    }
    
    
}