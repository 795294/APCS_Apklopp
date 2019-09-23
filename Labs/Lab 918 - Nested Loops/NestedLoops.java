
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
    
    //outer loop controls number of repetitions
    //execute inner loop to completion every cycle
    
    public static void problemD(int n){
        for(int r = n; r>=1; r--){
            for(int c = 0; c<r; c++){
                System.out.print("-");
            }
            System.out.println(r);
        }
    }
    
    public static void problemE(){
        for(int r = 7; r>=1; r--){
            for(int c = 0; c < r; c++){
                System.out.print(" ");
            }
            for(int c = 7; c>=r; c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void problemF(){
        probFUpper();
        probFLower();
    }
    
    public static void probFUpper(){
        for (int r = 0; r < 6; r++) {
             for (int spaces = 0; spaces < 6 - r; spaces++) {
                 System.out.print(" ");
             }
             for (int stars = 0; stars < 1 + 2 * r; stars++) {
                 System.out.print("*");
             }
             System.out.println();
        }
    }
    
    public static void probFLower(){
        for (int r = 6; r>=0; r--) {
             for (int spaces = 0; spaces < 6 - r; spaces++) {
                 System.out.print(" ");
             }
             for (int stars = 0; stars < 1 + 2 * r; stars++) {
                 System.out.print("*");
             }
             System.out.println();
        }
    }
    
    
    //Don't know
    
    public static void problemG(){
        for (int r = 0; r < 4; r++) {
             for (int spaces = 0; spaces < 4 - r; spaces++) {
                 System.out.print(" ");
             }
             for (int slashes = 0; slashes < 1 + 2 * r; slashes++) {
                 System.out.print("/");
             }
             System.out.println();
        }
    }
    
}
