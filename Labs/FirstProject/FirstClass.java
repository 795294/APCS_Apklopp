
/**
 * Write a description of class FirstClass here.
 *
 * @author (Peter Klopp)
 * @version (815)
 */
public class FirstClass
{

    private static int x;
    
    public FirstClass()
    {
     
    }
    
    
    public static void printName(String name, int n){
        System.out.print("Hello there," + name + " " + n);
    }
    
    public static void main(){
        x = 2048;
        printName("Peter", x);
    }
}
