
/**
 * Write a description of class PersonRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PersonRunner
{
    public PersonRunner()
    {

    }
    
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        
        
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            
            System.out.println(inputStr);
            Person p = new Person(inputStr);
        }
        
        
    }
}
