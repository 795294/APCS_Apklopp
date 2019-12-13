
/**
 * Student list manipulation methods.
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
            System.out.print(studList.get(i).getFullName() + "; " + studList.get(i).getStuNumber() + "; " + studList.get(i).getGPA());
            
            System.out.println();
        }
        
    }
    

    public void clearList(){
        studList.clear(); //arraylist method to empty the studList
        if(studList.size() <=0){
            System.out.print("\nThe student list is currently empty.");
        }
    }

    public void printStudent(String lastName){
        int count = 0;
        for(int i = 0; i<studList.size();i++){
            
            if(lastName.equals(studList.get(i).getLastName())){
                System.out.println("Student Name: " + studList.get(i).getFullName() + ", Student Number: " +  studList.get(i).getStuNumber() + ", Student GPA: " + studList.get(i).getGPA());
                    
            }
            if(!lastName.equals(studList.get(i).getLastName())){
                count++;
            }
        }

        if(count == studList.size()){
            System.out.println("\nThe name does not match a student in the list");
        }
    }

    public void printStudent(int stuNumber){
        int count = 0;
        
        for(int i = 0; i<studList.size();i++){
            
            if(stuNumber == studList.get(i).getStuNumber()){
                System.out.println("Student Name: " + studList.get(i).getFullName() + ", Student Number: " + studList.get(i).getStuNumber() + ", Student GPA: " + studList.get(i).getGPA());
            }
            
            if(stuNumber != studList.get(i).getStuNumber()){
                count++;
            }
        }

        if(count == studList.size()){
            System.out.println("\nThe number does not match a student in the list");
        }
    }
    
    public void swap(ArrayList<Student> tempList, int i, int n){
        Student temp = tempList.get(i);
        tempList.set(i, tempList.get(n));
        tempList.set(n, temp);
    }

   
    public void sortStudentsName(){
        for(int i = 1; i<studList.size(); i++){//insertion sort
            
            int j = i;
            while(j>0 && (studList.get(j).getLastName().compareTo(studList.get(j-1).getLastName()))<0)//comareTo is a java string method
            {
                swap(studList, j, j-1);
                j--;
            }
        }

    }

    public void sortStudentsNum(){
        for(int i = 1; i<studList.size(); i++){
            
            int j = i;
            
            while(j>0 && (studList.get(j).getStuNumber() < studList.get(j-1).getStuNumber())){
                swap(studList, j, j-1);
                j--;
            }
        }
    }

    
    public void clearScreen(){
        System.out.print('\u000C'); //unicode page breaker character
    }
    
    //returns all students in studList with a student number less than r equal to a certain threshold value

    public ArrayList<Student> filterSearchStudentList(int stuNum){
        
        ArrayList<Student> filteredList = new ArrayList<Student>();
        
        int existance = 0;

        for(int i = 0; i<studList.size(); i++){
            
            if(studList.get(i).getStuNumber() <= stuNum){
                
                Student keyListOb = new Student(studList.get(i).getFullName(), studList.get(i).getStuNumber(), studList.get(i).getGPA());
                filteredList.add(keyListOb);
            }
            
            else{
                existance++;
            }
        }
        if(existance == studList.size()){
            System.out.println("\nNo results");
        }

        for(int i =0; i<filteredList.size();i++){
            System.out.println("Student Name: " + filteredList.get(i).getFullName() + ", Student Number: " + filteredList.get(i).getStuNumber() + ", Student GPA: " + filteredList.get(i).getGPA());
        }

        return filteredList;
    }

    public ArrayList<Student> filterSearchStudentList(double GPA){//stuGPA
        ArrayList<Student> filteredList = new ArrayList<Student>();
        
        int existance = 0;

        for(int i = 0; i<studList.size(); i++){
            if(studList.get(i).getGPA() <= GPA){
                
                Student keyListOb = new Student(studList.get(i).getFullName(), studList.get(i).getStuNumber(), studList.get(i).getGPA());
                filteredList.add(keyListOb);
            }
            else{
                existance++;
            }
        }
        if(existance == studList.size()){
            
            System.out.println("\nNo results");
        }
        
        

        for(int i =0; i<filteredList.size();i++){
            
            System.out.println("Student Name: " + filteredList.get(i).getFullName() + ", Student Number: " + filteredList.get(i).getStuNumber() + ", Student GPA: " + filteredList.get(i).getGPA());
        }

        return filteredList;
    }
//edit list by name
    public void editStudentList(String lastName){
        for(int i = 0; i<studList.size();i++){
            
            if(lastName.equals(studList.get(i).getLastName())){
                
                System.out.println("Student Name: " + studList.get(i).getFullName() + ", Student Number: " + studList.get(i).getStuNumber() + ", Student GPA: " + studList.get(i).getGPA());

                Scanner input = new Scanner(System.in);
                String newName = "";
                double newGPA;

                System.out.print("Student name: ");
                newName = input.nextLine();

                System.out.print("Student GPA: ");
                newGPA = input.nextDouble();

                Student temp = new Student(newName, studList.get(i).getStuNumber(), newGPA);
                studList.set(i, temp);
            }
        }
    }
//edit list by number
    public void editStudentList(int stuNumber){
        for(int i = 0; i<studList.size();i++){
            if(stuNumber == studList.get(i).getStuNumber()){
                
                System.out.println("Student Name: " + studList.get(i).getFullName() + ", Student Number: " + 
                studList.get(i).getStuNumber() + ", Student GPA: " + studList.get(i).getGPA());

                Scanner input = new Scanner(System.in);
                String newName = "";
                double newGPA;

                System.out.print("Student name: ");
                newName = input.nextLine();

                System.out.print("Student GPA: ");
                newGPA = input.nextDouble();

                Student temp = new Student(newName, studList.get(i).getStuNumber(), newGPA);
                studList.set(i, temp);
            }
        }
    }
    
    
    
}
