
/**
 * Write a description of class PersonRunner here.
 *
 * @author (Peter Klopp)
 * @version (Lab924/Lab926)
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
            
            
            Person[] p = new Person[2];
            printNames(p);
            
        }
    }
    
    public Person[] extendArray(Person[] p, int n){
      Person[] p2 = new Person[p.length + n];
          for (int i = 0; i < p2.length; i++) {
             p2[i] = p[i];
          }
      
      return p2;
    }
    
    public static void printNames(Person[] p2){
        for(int i = 0; i < p2.length; i++){
            System.out.println("First name:" + p2[i].fName);
            System.out.println("Middle name:" + p2[i].mName);
            System.out.println("Last name:" + p2[i].lName);
        }
    }
}
