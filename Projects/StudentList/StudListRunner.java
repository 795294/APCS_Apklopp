
/**
 * Write a description of class StudListRunner here.
 *
 * @author (Peter Klopp)
 * @version (10/25)
 */
import java.util.*;

public class StudListRunner
{
 
    public StudListRunner()
    {
        
    }

    public static void mainMenu(){
        StudList studList = new StudList();
        
        Scanner kb = new Scanner(System.in);
        
        String inputStr= "";
        
        while(!inputStr.equals("quit")){
            System.out.println("\n Please select an option by typing a number or type \"quit\" and to exit.");
            
            System.out.println("1. Add a student\n2. Delete a student\n3. Print StudentList");
            System.out.println("4. Search for a Student\n5. Clear Student List\n6. Sort Student List");
            System.out.println("7. Print one Student\n8. Edit Student List");
            inputStr = kb.nextLine();
            
            if(inputStr.equals("1")){
                //studList.addStudent();
            }
            if(inputStr.equals("3")){
                //studList.printList();
            }
        }
    }
}
