
/**
 * Write a description of class NestedLoops here.
 *
 * @author (Peter Klopp)
 * @version (Lab 918)
 */
public class NestedLoops
{
    public NestedLoops()
    {

    }
    
    public static void problemA(){
        for(int r = 1; r <= 5; r++){
            for(int c = 0; c < r; c++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
    
    public static void problemB() {
        for(int r = 5; r >=2; r--){
            for(int c = 0; c < 8; c++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
    
    public static void problemC(int n){
        
        for(int r = 1; r <=n; r++){
            for(int c = 0; c<n; c++){
                System.out.print(n);
            }
            
            System.out.println();
        }
    }
    
    public static void problemD(int n){
        for(int r = 7; r>=n; r--){
            for(int c = 0; c<n; c++){
                System.out.print("-"+ r);
            }
        }
    }
    
}
