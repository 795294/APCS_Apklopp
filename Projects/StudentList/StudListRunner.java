
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

    public static void main(){
        
        StudList studList = new StudList();
        
        Scanner in = new Scanner(System.in);
        String inputStatement = in.nextLine();
        
        while(!inputStatement.equals("quit")){
            
            inputStatement = in.nextLine();

            studList.addStudentToList("");
                
            
        }
        
    }
}
