
/**
 * StudentList main menu.
 *
 * @author (Peter Klopp)
 * @version (10/25)
 */
import java.util.*;

public class StudListRunner
{

    public StudListRunner()
    {

    }

    public static void mainMenu(){
        StudList studList = new StudList();

        Scanner kb = new Scanner(System.in);

        String inputStr= "";

        while(!inputStr.equals("quit")){
            System.out.println("\n Please select an option by typing a number or type \"quit\" and to exit.");

            System.out.println("1. Add a student\n2. Delete a student\n3. Print StudentList");
            System.out.println("4. Search for a Student\n5. Clear Student List\n6. Sort Student List by Name");
            System.out.println("7. Sort Student List by Number\n8. Print one Student\n9. Edit Student List");
            inputStr = kb.nextLine();

            if(inputStr.equals("1")){
                studList.addStudent();
            }
            if(inputStr.equals("2")){

                System.out.println("Would you like to enter a last name or a student number? Enter \"Number\" or \"Last Name\" to choose");

                String response = "";

                response = kb.nextLine();

                if(response.equals("Number")){
                    System.out.println("Enter student number:");

                    int inputNum;

                    inputNum = kb.nextInt();

                    studList.deleteStudent(inputNum);
                }

                if(response.equals("Last Name")){
                    System.out.println("Enter last name:");

                    String lName = "";

                    lName = kb.nextLine();

                    studList.deleteStudent(lName);
                }

            }
            if(inputStr.equals("3")){
                studList.printList();
            }
            if(inputStr.equals("5")){

                studList.clearList();

            }
            if(inputStr.equals("6")){
                studList.sortStudentsName();
            }

            if(inputStr.equals("7")){
                studList.sortStudentsNum();
            }
            if(inputStr.equals("8")){
                System.out.println("Would you like to enter a last name or a student number? Enter \"Number\" or \"Last Name\" to choose");

                String response = "";

                response = kb.nextLine();

                if(response.equals("Number")){
                    System.out.println("Enter student number:");

                    int inputNum;

                    inputNum = kb.nextInt();

                    studList.printStudent(inputNum);
                }

                if(response.equals("Last Name")){
                    System.out.println("Enter last name:");

                    String lName = "";

                    lName = kb.nextLine();

                    studList.printStudent(lName);
                }
            }
            if(inputStr.equals("9")){
                System.out.println("Would you like to enter a last name or a student number? Enter \"Number\" or \"Last Name\" to choose");

                String response = "";

                response = kb.nextLine();

                if(response.equals("Number")){
                    System.out.println("Enter student number:");

                    int inputNum;

                    inputNum = kb.nextInt();

                    studList.editStudentList(inputNum);
                }

                if(response.equals("Last Name")){
                    System.out.println("Enter last name:");

                    String lName = "";

                    lName = kb.nextLine();

                    studList.editStudentList(lName);
                }
            }
        }

    }
}
