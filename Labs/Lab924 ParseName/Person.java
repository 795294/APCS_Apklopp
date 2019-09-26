
/**
 * Write a description of class Person here.
 *
 * @author (Peter Klopp)
 * @version (Lab924/Lab926)
 */
public class Person
{
    String fName = "";
    String mName = "";
    String lName = "";
    
    private String[] fullName;
    
    
    public Person(String[] fullName)
    {
        parseName(fullName);
    }
    
    public void parseName(String[] fullName){
        
        for(int i = 0; i < fullName.length; i++){
            
            int comma = fullName[i].indexOf(",");
            
            //format 1
            if(comma != -1 && fullName[i].indexOf(" ") != fullName[i].lastIndexOf(" ")){
                lName = fullName[i].substring(0,fullName[i].indexOf(","));
                fName = fullName[i].substring(fullName[i].indexOf(",")+1, fullName[i].lastIndexOf(" "));
                mName = fullName[i].substring(fullName[i].lastIndexOf(" "));
            } 
            
            //format 2
            if(comma != -1 && fullName[i].indexOf(" ") == fullName[i].lastIndexOf(" ")){
                lName = fullName[i].substring(0,fullName[i].indexOf(","));
                fName = fullName[i].substring(fullName[i].indexOf(",")+1);
            }
            
            //format 3
            if(comma == -1 && fullName[i].indexOf(" ") != fullName[i].lastIndexOf(" ")){
                fName = fullName[i].substring(0, fullName[i].indexOf(" "));
                lName = fullName[i].substring(fullName[i].lastIndexOf(" "));
                mName = fullName[i].substring(fullName[i].indexOf(" "), fullName[i].lastIndexOf(" "));
            }
            
            //format 4
            if(comma == -1 && fullName[i].indexOf(" ") == fullName[i].lastIndexOf(" ")){
                fName = fullName[i].substring(0, fullName[i].indexOf(" "));
                lName = fullName[i].substring(fullName[i].lastIndexOf(" "));
            }
        }
        
    }

}
