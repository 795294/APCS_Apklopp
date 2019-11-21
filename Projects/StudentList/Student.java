
/**
 * Getters and setters for studList.
 *
 * @author (Peter Klopp)
 * @version (11/15/19)
 */
public class Student
{
    private String fullName = "";
    private String fName = "";
    private String mName = "";
    private String lName = "";
    private int studentNum;
    public double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int num, double GPA)
    {
        fullName = name;

        studentNum = num;

        gpa = GPA;
    }

    public String parseUserInput(){
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
        
        return lName + "," + fName + mName;

    }

    public String getFullName(){
        return lName + "," + fName + mName;
    }
    
    public void setFullName(String fullname){
        fullName = fullname;
    }

    public double getGPA(){
        return gpa; 
    }

    public int getStuNumber(){
        return studentNum;
    }

    public void setFirstName(String fn){
        fName = fn;
    }

    public void setMiddleName(String mn){
        mName = mn;
    }

    public void setLastName(String ln){
        lName = ln;
    }
    
    public String getFirstName(){
        return fName;
    }

    public String getMiddleName(){
        return mName;
    }

    public String getLastName(){
        return lName;
    }

    public void setStuNumber(int sn){
        studentNum = sn;
    }

    public void setGPA(double gradePoint){
        gpa = gradePoint;
    }

}
