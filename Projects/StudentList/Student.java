
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public String fullName = "";
    public String fName = "";
    public String mName = "";
    public String lName = "";
    public int studentNum;
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
    
    public String getFullName(){//  getter for an instance variable
       return lName + "," + fName + mName;
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
    
    public void setStuNumber(int sn){
        studentNum = sn;
    }
    
    public void setGPA(int gradePoint){
        gpa = gradePoint;
    }
    
}
