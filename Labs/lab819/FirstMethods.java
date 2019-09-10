
/**
 * Write a description of class FirstMethods here.
 *
 * @author (Peter Klopp)
 * @version (Lab 819)
 */
public class FirstMethods
{

    public FirstMethods()
    {
        
    }

    
    public static int add(int a , int b) {
        return a+b; 
    }
    
    public static int subtract(int a , int b) {
        return a-b; 
    }
    
    public static int mult(int a , int b) {
        return a*b; 
    }
    
    public static int divide(int a , int b) {
        if(b==0){
            return 999999;
        }
        
        return a/b; 
    }
    
    public static int greaterThan(int a, int b){
        if(a>b){
            return a;
        } else if(a==b){
            return 0;
        } else {
            return b;
        }  
    }
    
    public static void main(){
        System.out.println(add(7,5));
        System.out.println(subtract(6,5));
        System.out.println(mult(7,6));
        System.out.println(divide(4,0));
        System.out.println(greaterThan(4,4));
    }
}
