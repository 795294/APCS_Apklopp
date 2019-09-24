
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
        
        if(comma != -1){
            lName = fullName.substring(0,fullName.indexOf(","));
            fName = fullName.substring(fullName.indexOf(",")+2, fullName.lastIndexOf(" "));
            mName = fullName.substring(fullName.lastIndexOf(" "));
        } else {
            fName = fullName.substring(0, fullName.indexOf(" "));
            lName = fullName.substring(fullName.lastIndexOf(" "));
            mName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        }
    }

}
