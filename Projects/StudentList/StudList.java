
/**
 * Write a description of class StudList here.
 *
 * @author (Peter Klopp)
 * @version (10/25)
 */
import java.util.*;

public class StudList
{
    ArrayList<Student> studList = new ArrayList<Student>();

    private String fName = "";
    private String mName = "";
    private String lName = "";

    public StudList()
    {

    }

    //public void addStudent(){
        
        
        /*int comma = fullName.indexOf(",");

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
        }*/
    //}
    
    public void addStudent(){
        Scanner input = new Scanner(System.in);
        
        String inputName = "";
        
        int inputNum;
        
        double inputGPA;
        
        System.out.print("Student name: ");
        inputName = input.nextLine();
        
        System.out.print("Student number: ");
        inputNum = input.nextInt();
        
        System.out.print("Student GPA: ");
        inputGPA = input.nextDouble();
        
        //Student studListObject = new Student(inputName, inputNum, inputGPA);
        studList.add(studListObject);
           
    }
    
    /*
     * Clears the screen and then prints the list to the screen.  
     * Does not print null records
     */
    public void printList(){
        for(int i = 0; i<studList.size(); i++){
            System.out.print(studList.get(i) + "/n" );
        }
        
    }
    
    public void deleteStudent(String lastName){
        for(int i  = 0; i < studList.size(); i++){
            ///if(studList.get(i).indexOf(lastName) != -1){
               //studList.remove(i);
            //}
        }
        
    }
    
    public void deleteStudent(int stuNumber){
        for(int i  = 0; i < studList.size(); i++){
            //if(studList.get(i).stuNumber == stuNumber){
            //}
        }
    }
    
    public void editStudentList(int stuNumber){
        
    }
    
    public void clearList(){
        
    }
    
    public void printList(){
        
    }
    
    public void printStudent(){
        
    }
    
    public void sortStudents(String lastName){
        
    }
    
    public void sortStudents(int stuNumber){
        
    }
    
    public ArrayList<Student> filterSearchStudentList(String key){
        
    }
    
    

}
