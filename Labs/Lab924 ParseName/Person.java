
/**
 * Write a description of class Person here.
 *
 * @author (Peter Klopp)
 * @version (Lab924)
 */
public class Person
{
    String fName = "";
    String mName = "";
    String lName = "";
    
    public Person(String fullName)
    {
        parseName(fullName);
    }
    
    public void parseName(String fullName){
        int comma = fullName.indexOf(",");
        
        //format 1
        if(comma != -1 && fullName.indexOf(" ") != fullName.lastIndexOf(" ")){
            lName = fullName.substring(0,fullName.indexOf(","));
            fName = fullName.substring(fullName.indexOf(",")+1, fullName.lastIndexOf(" "));
            mName = fullName.substring(fullName.lastIndexOf(" "));
        } 
        
        //format 2
        if(comma != -1 && fullName.indexOf(" ") == fullName.lastIndexOf(" ")){
            lName = fullName.substring(0,fullName.indexOf(","));
            fName = fullName.substring(fullName.indexOf(",")+1);
        }
        
        //format 3
        if(comma == -1 && fullName.indexOf(" ") != fullName.lastIndexOf(" ")){
            fName = fullName.substring(0, fullName.indexOf(" "));
            lName = fullName.substring(fullName.lastIndexOf(" "));
            mName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        }
        
        //format 4
        if(comma == -1 && fullName.indexOf(" ") == fullName.lastIndexOf(" ")){
            fName = fullName.substring(0, fullName.indexOf(" "));
            lName = fullName.substring(fullName.lastIndexOf(" "));
        }
        
    }

}
