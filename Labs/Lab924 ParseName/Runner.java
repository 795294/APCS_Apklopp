
/**
 * Write a description of class PersonRunner here.
 *
 * @author (Peter Klopp)
 * @version (Lab924/Lab926)
 */
import java.util.Scanner;

public class Runner{

    public static void main(){

        Scanner kb = new Scanner(System.in);
        String inputStr = "";

        Person[] personArray = new Person[1];

        int i = 0;

        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");

            inputStr = kb.nextLine();
            System.out.println(inputStr);

            if(!inputStr.equals("quit")){
                
                Person p = new Person(inputStr);
                
                personArray[i] = p;
                printNames(personArray);

                if(personArray[personArray.length-1] != null){
                    System.out.println("\n Done with the list?");
                    inputStr = kb.nextLine();
                    
                    if(inputStr.equals("no")){
                        personArray = extendArray(personArray, 1);
                    }

                }
            }
            
            i++;
        }

    }

    public static Person[] extendArray(Person[] personArray, int n){
        Person[] personArray2 = new Person[personArray.length + n];

        for(int i=0;i<personArray.length; i++){
            personArray2[i] = personArray[i];
        }

        return personArray2;
    }

    public static void printNames(Person[] p){
        System.out.print("List: ");

        for(int i = 0;i<p.length;i++){
            p[i].printName();
        }

    }

}
