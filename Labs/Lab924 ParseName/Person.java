
/**
 * Write a description of class Person here.
 *
 * @author (Peter Klopp)
 * @version (Lab924/Lab926)
 */
public class Person
{
    private String fName = "";
    private String mName = "";
    private String lName = "";

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
            
            System.out.println();
            System.out.println("First Name: " + fName);
            System.out.println("Middle Name: " + mName);
            System.out.println("Last Name: " + lName);
        
    }
    
    public String getfName(){//  getter for an instance variable
        return fName;
    }
    
    public void setLastName(String ln){
        lName = ln;
    }
    
    public void printName(){
        if(!fName.equals("")){
        System.out.print(fName + " ");
        System.out.print(mName + " ");
        System.out.print(lName+", ");
        }
        else{
            System.out.println("Your name is incorrectly formatted, ");
        }
    }

}
