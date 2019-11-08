
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
        
        Student studListObject = new Student(inputName, inputNum, inputGPA);
        studList.add(studListObject);
        
        studListObject.parseUserInput();
        studListObject.setStuNumber(inputNum);
        studListObject.setGPA(inputGPA);
           
    }
    
    public void deleteStudent(int stuNumber){
        // Scanner input = new Scanner(System.in);
        
        // String inputName = "";
        
        // int inputNum;
        
        // double inputGPA;
        
        // System.out.print("Student name: ");
        // inputName = input.nextLine();
        
        // System.out.print("Student number: ");
        // inputNum = input.nextInt();
        
        // System.out.print("Student GPA: ");
        // inputGPA = input.nextDouble();
        
        // Student studListObject = new Student(inputName, inputNum, inputGPA);
        // studList.add(studListObject);
        
        // studListObject.parseUserInput();
        // studListObject.setStuNumber(inputNum);
        // studListObject.setGPA(inputGPA);
    }
    
    public void printList(){
        for(int i = 0; i<studList.size(); i++){
            System.out.print(studList.get(i).getFullName() + "; " 
            + studList.get(i).getStuNumber() + "; " + studList.get(i).getGPA());
            
            System.out.println();
        }
        
    }
    
    public void editStudentList(int stuNumber){
        
    }
    
    public void clearList(){
        
    }
    
    
    public void printStudent(){
        
    }
    
    public void sortStudents(String lastName){
        
    }
    
    public void sortStudents(int stuNumber){
        
    }
    
}
