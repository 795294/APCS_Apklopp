
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
    
    public void deleteStudent(String lName){
        for(int i = 0; i<studList.size();i++){
            if(lName.equals(studList.get(i).getLastName())){
                studList.remove(i);
            }
        }
    }
    
    public void deleteStudent(int stuNumber){
        for(int i = 0; i<studList.size();i++){
            if(stuNumber == studList.get(i).getStuNumber()){
                studList.remove(i);
            }
        }
    }
    
    public void printList(){
        for(int i = 0; i<studList.size(); i++){
            System.out.print(studList.get(i).getFullName() + "; " 
            + studList.get(i).getStuNumber() + "; " + studList.get(i).getGPA());
            
            System.out.println();
        }
        
    }
    

    // /*
     // * Deletes the entire list (null in each element without a student record)
     // */
    // public void clearList(){
        // studList.clear();
        // if(studList.size() <=0){
            // System.out.print("\nThere are no students currently in the Student list.");
        // }
    // }

    // /*
     // * Clears  the screen and then prints a student with the input name to the screen.  
     // * If the Student does not exist, print message to the console: "Student does not exist."
     // */
    // public void printStudent(String lastName){
        // int existVal = 0;
        // for(int i = 0; i<studList.size();i++){
            // if(lastName.equals(studList.get(i).getLastName())){
                // System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    // studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());
            // }
            // if(!lastName.equals(studList.get(i).getLastName())){
                // existVal++;
            // }
        // }

        // if(existVal == studList.size()){
            // System.out.println("\nStudent does not exist.");
        // }
    // }

    // /*
     // * Clears  the screen and then prints a student student with the input student number to the screen.  
     // * If the Student does not exist, print message to the console: "Student does not exist."
     // */
    // public void printStudent(int stuNumber){
        // int existVal = 0;
        // for(int i = 0; i<studList.size();i++){
            // if(stuNumber == studList.get(i).getNum()){
                // System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    // studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());
            // }
            // if(stuNumber != studList.get(i).getNum()){
                // existVal++;
            // }
        // }

        // if(existVal == studList.size()){
            // System.out.println("\nStudent does not exist.");
        // }
    // }

    // /*
     // * Sorts students by student name
     // */
    // public void sortStudentsName(){
        // for(int i = 1; i<studList.size(); i++){//insertion sort
            // int j = i;
            // while(j>0 && (studList.get(j).getLastName().compareTo(studList.get(j-1).getLastName()))<0)
            // {
                // swapList(studList, j, j-1);
                // j--;
            // }
        // }

    // }

    // /*
     // * Sorts students by student number,
     // * want to put object with smallest student number at 
     // * front of list
     // */
    // public void sortStudentsNum(){
        // for(int i = 1; i<studList.size(); i++){//insertion sort
            // int j = i;
            // while(j>0 && (studList.get(j).getNum() < 
                // studList.get(j-1).getNum())){
                // swapList(studList, j, j-1);
                // j--;
            // }
        // }
    // }

    // //swapping method for different sorting methods
    // public void swapList(ArrayList<Student> tempList, int i, int n){
        // Student temp = tempList.get(i);
        // tempList.set(i, tempList.get(n));
        // tempList.set(n, temp);
    // }

    // /*
     // * Allows the user to specify a student name and then update or change the Student name and GPA
     // */
    // public void editStudentList(String lastName){
        // for(int i = 0; i<studList.size();i++){
            // if(lastName.equals(studList.get(i).getLastName())){
                // System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    // studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());

                // Scanner kb2 = new Scanner(System.in);
                // String newName = "";
                // double newGPA;

                // System.out.print("Student name: ");
                // newName = kb2.nextLine();

                // System.out.print("Student GPA: ");
                // newGPA = kb2.nextDouble();

                // Student studListTemp = new Student(newName, studList.get(i).getNum(), newGPA);
                // studList.set(i, studListTemp);
            // }
        // }
    // }

    // /*
     // * Allows the user to specify a Student number and then update or change the Student name and GPA
     // */
    // public void editStudentList(int stuNumber){
        // for(int i = 0; i<studList.size();i++){
            // if(stuNumber == studList.get(i).getNum()){
                // System.out.println("Student Name: " + studList.get(i).getName() + ", Student Number: " + 
                    // studList.get(i).getNum() + ", Student GPA: " + studList.get(i).getGPA());

                // Scanner kb2 = new Scanner(System.in);
                // String newName = "";
                // double newGPA;

                // System.out.print("Student name: ");
                // newName = kb2.nextLine();

                // System.out.print("Student GPA: ");
                // newGPA = kb2.nextDouble();

                // Student studListTemp = new Student(newName, studList.get(i).getNum(), newGPA);
                // studList.set(i, studListTemp);
            // }
        // }
    // }
    
}
